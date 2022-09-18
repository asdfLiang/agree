package com.cm.service.client;

import com.cm.client.service.CooperationClient;
import com.cm.model.dto.cooperation.CooperationDTO;
import com.cm.service.CooperationService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/9/10 18:18
 */
@DubboService
public class CooperationClientImpl implements CooperationClient {

    @Autowired CooperationService cooperationService;

    @Override
    public void create(List<CooperationDTO> cooperations) {
        cooperationService.create(cooperations);
    }
}
