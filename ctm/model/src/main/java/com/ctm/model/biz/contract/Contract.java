package com.ctm.model.biz.contract;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 合同
 *
 * @author by liangzj
 * @since 2022/8/13 13:25
 */
@Data
public class Contract {

    /** 合同id */
    private String contractId;

    /** 合同文件 */
    @NotBlank(message = "合同文件不能为空")
    private String fileId;

    /** 所属租户 */
    @NotBlank(message = "所属租户不能为空")
    private String tenantId;

    /** 合同控件 */
    private List<Struct> structs;
}
