package com.cpm.service.impl;

import com.cm.client.service.ContractClient;
import com.cpm.pojo.dto.ProcessDTO;
import com.cpm.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by liangzj
 * @since 2022/8/13 16:50
 */
@Service
public class ProcessServiceImpl implements ProcessService {

    @Autowired ContractClient contractService;

    @Override
    public void save(ProcessDTO process) {}

    @Override
    public void update() {}

    @Override
    public void delete() {}
}
