package com.cpm.pojo.bo.process;

import com.cm.model.dto.cooperation.CooperationDTO;
import lombok.Data;

import java.util.List;

/**
 * 合同流程节点
 *
 * @author by liangzj
 * @since 2022/8/13 13:25
 */
@Data
public class SubProcessBO {

    /** 所属流程id */
    private String processId;

    /** 流程节点id */
    private String subProcessId;

    /** 节点类型 */
    private Integer type;

    /** 节点包含的参与人 */
    private List<CooperationDTO> cooperations;

    /** 节点序列 */
    private Integer sequence;
}
