package com.cpm.pojo.bo.process.base;

import com.cpm.model.enums.StartTypeEnum;
import lombok.Data;

import java.util.Date;

/**
 * 合同流程基本信息
 *
 * @author by liangzj
 * @since 2022/8/14 1:00
 */
@Data
public class BaseProcessBO {
    /** 流程id */
    private String processId;

    /** 合同标题 */
    private String title;

    /** 来源模板 */
    private String flowTemplateId;

    /** 合同配置 */
    private ConfigBO config;

    /** 发起类型， 参考：{@link StartTypeEnum#getCode 发起类型枚举} */
    private Integer startType;

    /** 流程状态 */
    private Integer status;

    /**
     * 合同配置
     *
     * @author by liangzj
     */
    @Data
    public static class ConfigBO {

        /** 是否保密 */
        private Boolean secret;

        /** 合同到期时间 */
        private Date expireDate;

        /** 签署截止时间 */
        private Date signDeadLine;
    }
}
