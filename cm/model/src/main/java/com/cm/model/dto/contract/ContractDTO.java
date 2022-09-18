package com.cm.model.dto.contract;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 合同
 *
 * @author by liangzj
 * @since 2022/8/13 13:25
 */
@Data
public class ContractDTO implements Serializable {

    @Serial private static final long serialVersionUID = -966775006544543566L;

    private Long id;

    /** 合同id */
    private String contractId;

    /** 合同文件 */
    @NotBlank(message = "合同文件不能为空")
    private String fileId;

    /** 所属租户 */
    @NotBlank(message = "所属租户不能为空")
    private String tenantId;

    /** 合同来源id */
    private String sourceId;

    /** 合同来源类型：1.模板 2.合同 */
    private Integer sourceType;

    /** 合同控件 */
    private List<StructDTO> structs;
}
