package com.ctm.deploy.controller;

import com.cm.client.enums.StructTypeEnum;
import com.contract.common.tools.Json;
import com.contract.common.tools.UUIDUtil;
import com.ctm.deploy.ContractTemplateApplication;
import com.ctm.deploy.JsonFileSource;
import com.ctm.deploy.vo.FlowTemplateVO;
import com.ctm.model.biz.contract.Contract;
import com.ctm.model.biz.contract.Struct;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

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
    void testConfirmStructs() {}

    void testGetFlowTemplate() {}

    @ParameterizedTest
    @JsonFileSource
    @Rollback
    @Transactional
    @Test
    void testCreateFlowTemplate(FlowTemplateVO createTemplateData) throws Exception {

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/flow-template/create")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(Json.from(createTemplateData)))
                .andDo(result -> log.info("{}", result.getResponse().getContentAsString()))
                .andExpect(jsonPath("$.success").value(true));
    }
}
