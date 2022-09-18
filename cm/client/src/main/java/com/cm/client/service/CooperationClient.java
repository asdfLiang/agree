package com.cm.client.service;

import com.cm.model.dto.cooperation.CooperationDTO;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/9/10 15:57
 */
public interface CooperationClient {

    /**
     * 添加协作方
     *
     * @param cooperation 协作方
     */
    void create(List<CooperationDTO> cooperations);
}
