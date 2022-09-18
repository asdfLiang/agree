package com.cm.dal.mapper;

import com.cm.dal.entity.StructDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/23 18:36
 */
@Mapper
public interface StructMapper {

    int insertBatch(Collection<StructDO> structs);

    List<StructDO> list(Collection<String> contractIds);

    int updateByStructId(StructDO structDO);
}
