package com.cm.mapper;

import com.cm.dal.entity.ContractDO;
import com.cm.dal.mapper.ContractMapper;
import com.cm.deploy.ContractManagerApplication;
import com.contract.common.tools.UUIDUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

/**
 * @author by liangzj
 * @since 2022/8/22 23:51
 */
@SpringBootTest(classes = ContractManagerApplication.class)
class ContractMapperTest {
    @Autowired ContractMapper contractMapper;

    @Transactional
    @Rollback
    @Test
    void testInsert() {
        ContractDO contractDO = new ContractDO();
        contractDO.setFileId(UUIDUtil.getNonBreak());
        contractDO.setTenantId(UUIDUtil.getNonBreak());
        contractDO.setContractId(UUIDUtil.getNonBreak());

        contractMapper.insertBatch(Collections.singletonList(contractDO));
    }

    @Test
    void testSelect() {
        System.out.println(contractMapper.select("1826895f1bbc4da7b280048be3065d79"));
    }
}
