package com.cm.dal.mapper;

import com.cm.dal.entity.ContractDO;
import com.cm.dal.entity.condition.ContractCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/21 13:11
 */
@Mapper
public interface ContractMapper {

    Long insertBatch(List<ContractDO> contracts);

    ContractDO select(String contractId);

    List<ContractDO> selectByCondition(ContractCondition condition);
}
