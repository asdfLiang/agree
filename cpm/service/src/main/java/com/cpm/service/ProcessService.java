package com.cpm.service;

import com.cpm.pojo.dto.ProcessDTO;

/**
 * @author by liangzj
 * @since 2022/8/13 16:08
 */
public interface ProcessService {

    /** 创建合同流程 */
    void save(ProcessDTO process);

    /** 更新合同流程 */
    void update();

    /** 删除合同流程 */
    void delete();
}
