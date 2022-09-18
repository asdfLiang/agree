package com.cm.service;

import com.cm.model.dto.cooperation.CooperationDTO;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/9/10 18:27
 */
public interface CooperationService {

    void create(List<CooperationDTO> cooperationDTOS);
}
