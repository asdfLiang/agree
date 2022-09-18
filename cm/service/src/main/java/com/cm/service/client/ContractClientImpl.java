package com.cm.service.client;

import com.cm.client.service.ContractClient;
import com.cm.model.dto.contract.ContractDTO;
import com.cm.model.dto.contract.StructDTO;
import com.cm.service.ContractService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/23 23:50
 */
@DubboService
public class ContractClientImpl implements ContractClient {
    @Autowired ContractService contractService;

    @Override
    public List<ContractDTO> create(List<ContractDTO> contracts) {
        return contractService.create(contracts);
    }

    @Override
    public void confirmStructs(List<StructDTO> structs) {
        contractService.confirmStructs(structs);
    }

    @Override
    public ContractDTO get(String contractId) {
        return contractService.get(contractId);
    }

    @Override
    public List<ContractDTO> listBySource(String sourceId, Integer sourceType) {
        return contractService.list(sourceId, sourceType);
    }
}
