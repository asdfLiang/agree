package com.cm.service;

import com.cm.model.dto.contract.ContractDTO;
import com.cm.model.dto.contract.StructDTO;

import java.util.List;

/**
 * 合同相关操作，内部RPC接口
 *
 * @author by liangzj
 * @since 2022/8/14 23:59
 */
public interface ContractService {

    /**
     * 保存合同
     *
     * @param contracts 合同信息
     * @return
     */
    List<ContractDTO> create(List<ContractDTO> contracts);

    void confirmStructs(List<StructDTO> structs);

    List<ContractDTO> list(String sourceId, Integer sourceType);

    ContractDTO get(String contractId);
}
