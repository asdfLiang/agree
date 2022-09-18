package com.cm.dal.mapper;

import com.cm.dal.entity.CooperationDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/23 18:36
 */
@Mapper
public interface CooperationMapper {

    Long insertBatch(Collection<CooperationDO> cooperations);

    /**
     * 批量获取控件信息
     *
     * @param cooperationIds
     * @return
     */
    List<CooperationDO> list(Collection<String> cooperationIds);
}
