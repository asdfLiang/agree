package com.ctm.deploy.controller;

import com.alibaba.fastjson2.JSON;
import com.cm.client.enums.CooperationTypeEnum;
import com.cm.client.enums.StructTypeEnum;
import com.contract.common.tools.UUIDUtil;
import com.ctm.deploy.ContractTemplateApplication;
import com.ctm.deploy.vo.FlowTemplateVO;
import com.ctm.model.biz.FlowTemplateConfig;
import com.ctm.model.biz.contract.Contract;
import com.ctm.model.biz.contract.Cooperation;
import com.ctm.model.biz.contract.Struct;
import com.ctm.model.biz.participant.Cooperator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.Collections;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * @author by liangzj
 * @since 2022/9/3 9:42
 */
@Slf4j
@AutoConfigureMockMvc
@SpringBootTest(classes = ContractTemplateApplication.class)
class FlowTemplateControllerTest {
    @Autowired private MockMvc mockMvc;

    private static Contract getContract() {
        // 合同
        Contract contract = new Contract();
        contract.setFileId(UUIDUtil.getNonBreak());
        contract.setTenantId(UUIDUtil.getNonBreak());

        // 控件
        Struct struct = new Struct();
        struct.setStructId(UUIDUtil.getNonBreak());
        struct.setType(StructTypeEnum.TEXT.getCode());

        contract.setStructs(Collections.singletonList(struct));

        return contract;
    }

    @Test
    void testCreateFlowTemplate() throws Exception {
        FlowTemplateVO vo = new FlowTemplateVO();
        Contract contract = getContract();

        FlowTemplateConfig config = new FlowTemplateConfig();
        config.setSecret(1);

        vo.setTitle("单测新增模板");
        vo.setContracts(Collections.singletonList(contract));
        vo.setConfig(config);

        // 协作方
        Cooperation cooperation = new Cooperation();
        cooperation.setType(CooperationTypeEnum.USER.getCode());
        cooperation.setSignMethods(Collections.singletonList(1));
        cooperation.setWillAuthMethods(Arrays.asList(1, 2, 3));
        cooperation.setStructs(contract.getStructs());

        // 添加协作者
        Cooperator cooperator = new Cooperator();
        cooperator.setCooperationId(UUIDUtil.getNonBreak());
        cooperator.setUserId(UUIDUtil.getNonBreak());
        cooperator.setTenantId(UUIDUtil.getNonBreak());
        cooperator.setAccountType(1);
        cooperation.setCooperators(Collections.singletonList(cooperator));

        vo.setCooperations(Collections.singletonList(cooperation));

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/flow-template/create")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(JSON.toJSONString(vo)))
                .andDo(result -> log.info("{}", result.getResponse()))
                .andExpect(jsonPath("$.success").value(true));
    }

    @Test
    void testConfirmStructs() {}

    void testGetFlowTemplate() {}
}
