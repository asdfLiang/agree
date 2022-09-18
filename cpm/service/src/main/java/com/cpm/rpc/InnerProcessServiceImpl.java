package com.cpm.rpc;

import com.contract.common.result.Result;
import com.cpm.facade.InnerProcessService;
import com.cpm.model.input.CreateProcessInput;
import com.cpm.model.input.UpdateProcessInput;
import org.springframework.stereotype.Service;

/**
 * @author by liangzj
 * @since 2022/8/14 21:46
 */
@Service
public class InnerProcessServiceImpl implements InnerProcessService {

    @Override
    public Result create(CreateProcessInput input) {

        return Result.success(null);
    }

    @Override
    public Result update(UpdateProcessInput input) {

        return Result.success(null);
    }
}
