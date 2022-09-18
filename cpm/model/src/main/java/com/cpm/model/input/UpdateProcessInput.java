package com.cpm.model.input;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author by liangzj
 * @since 2022/8/14 20:48
 */
@Data
public class UpdateProcessInput implements Serializable {

    @NotBlank(message = "合同标题不能为空")
    private String title;
}
