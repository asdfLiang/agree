package com.cm.dal.mapper;

import com.cm.dal.entity.CooperatorDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/9/8 23:29
 */
@Mapper
public interface CooperatorMapper {

    void insertBatch(List<CooperatorDO> cooperators);

    List<CooperatorDO> list(String cooperationId);
}
