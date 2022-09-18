package com.cm.service.impl;

import com.cm.dal.entity.CooperationDO;
import com.cm.dal.entity.CooperatorDO;
import com.cm.dal.mapper.CooperationMapper;
import com.cm.dal.mapper.CooperatorMapper;
import com.cm.model.dto.cooperation.CooperationDTO;
import com.cm.model.dto.cooperation.CooperatorDTO;
import com.cm.service.CooperationService;
import com.contract.common.tools.Copier;
import com.contract.common.tools.Json;
import com.contract.common.tools.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by liangzj
 * @since 2022/9/10 18:27
 */
@Service
public class CooperationServiceImpl implements CooperationService {
    @Autowired CooperationMapper cooperationMapper;
    @Autowired CooperatorMapper cooperatorMapper;

    @Override
    public void create(List<CooperationDTO> cooperationDTOS) {
        // 协作方
        List<CooperationDO> cooperationDOS =
                cooperationDTOS.stream()
                        .peek(this::fillCooperationId)
                        .map(this::buildCooperationDO)
                        .collect(Collectors.toList());
        cooperationMapper.insertBatch(cooperationDOS);

        // 添加协作者
        List<CooperatorDO> cooperatorDOS =
                cooperationDTOS.stream()
                        .map(CooperationDTO::getCooperators)
                        .filter(ls -> !CollectionUtils.isEmpty(ls))
                        .flatMap(Collection::stream)
                        .map(x -> Copier.copy(x, CooperatorDO.class))
                        .peek(x -> x.setCooperatorId(UUIDUtil.getNonBreak()))
                        .collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(cooperationDOS)) {
            cooperatorMapper.insertBatch(cooperatorDOS);
        }
    }

    private void fillCooperationId(CooperationDTO dto) {
        dto.setCooperationId(UUIDUtil.getNonBreak());

        List<CooperatorDTO> cooperators = dto.getCooperators();
        if (!CollectionUtils.isEmpty(cooperators)) {
            for (CooperatorDTO cooperatorDTO : cooperators) {
                cooperatorDTO.setCooperationId(dto.getCooperationId());
            }
        }
    }

    private CooperationDO buildCooperationDO(CooperationDTO dto) {
        CooperationDO cooperationDO = Copier.copy(dto, CooperationDO.class);
        cooperationDO.setSignMethods(Json.from(dto.getSignMethods()));
        cooperationDO.setWillAuthMethods(Json.from(dto.getWillAuthMethods()));
        return cooperationDO;
    }
}
