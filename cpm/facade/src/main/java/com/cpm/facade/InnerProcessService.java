package com.cpm.facade;

import com.contract.common.result.Result;
import com.cpm.model.input.CreateProcessInput;
import com.cpm.model.input.UpdateProcessInput;

/**
 * 合同流程操作接口
 *
 * @author by liangzj
 * @since 2022/8/14 17:13
 */
public interface InnerProcessService {

    /**
     * 创建合同流程
     *
     * @param input
     */
    Result create(CreateProcessInput input);

    /**
     * 更新合同流程
     *
     * @param input
     * @return
     */
    Result update(UpdateProcessInput input);
}
