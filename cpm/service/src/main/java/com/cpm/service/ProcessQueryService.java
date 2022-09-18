package com.cpm.service;

import com.cpm.pojo.dto.ProcessDTO;

/**
 * 合同查询服务
 *
 * @author by liangzj
 * @since 2022/8/13 16:10
 */
public interface ProcessQueryService {

    ProcessDTO search(String processId);
}
