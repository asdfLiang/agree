package com.cm.client;

import com.cm.client.enums.StructTypeEnum;
import com.cm.client.service.ContractClient;
import com.cm.deploy.ContractManagerApplication;
import com.cm.model.dto.contract.ContractDTO;
import com.cm.model.dto.contract.StructDTO;
import com.contract.common.tools.Json;
import com.contract.common.tools.UUIDUtil;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

/**
 * @author by liangzj
 * @since 2022/8/22 23:51
 */
@SpringBootTest(classes = ContractManagerApplication.class)
public class ContractClientTest {
    @DubboReference ContractClient contractClient;

    @Transactional
    @Rollback
    @Test
    void testInsert() {
        // 合同
        ContractDTO contractDTO = new ContractDTO();
        contractDTO.setFileId(UUIDUtil.getNonBreak());
        contractDTO.setTenantId(UUIDUtil.getNonBreak());

        // 控件
        StructDTO structDTO = new StructDTO();
        structDTO.setStructId(UUIDUtil.getNonBreak());
        structDTO.setType(StructTypeEnum.TEXT.getCode());

        contractDTO.setStructs(Collections.singletonList(structDTO));

        contractClient.create(Collections.singletonList(contractDTO));
    }

    @Test
    void testSelect() {
        System.out.println(Json.from(contractClient.get("e0bbbb5f50484d54a0032665e97994b7")));
    }
}
