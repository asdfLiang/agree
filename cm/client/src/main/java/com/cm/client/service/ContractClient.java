package com.cm.client.service;

import com.cm.model.dto.contract.ContractDTO;
import com.cm.model.dto.contract.StructDTO;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/23 21:53
 */
public interface ContractClient {

    List<ContractDTO> create(List<ContractDTO> contracts);

    void confirmStructs(List<StructDTO> structs);

    /**
     * 获取合同信息
     *
     * @param contractId 合同id
     * @return 合同信息
     */
    ContractDTO get(String contractId);

    List<ContractDTO> listBySource(String sourceId, Integer sourceType);
}
