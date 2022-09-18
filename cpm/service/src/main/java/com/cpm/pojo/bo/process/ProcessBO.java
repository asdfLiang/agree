package com.cpm.pojo.bo.process;

import com.cm.model.dto.contract.ContractDTO;
import com.cpm.pojo.bo.process.base.BaseProcessBO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 合同流程
 *
 * @author by liangzj
 * @since 2022/8/13 13:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessBO extends BaseProcessBO {

    /** 流程节点 */
    List<SubProcessBO> subProcesses;
    /** 抄送人列表 */
    List<String> ccAccounts;
    /** 可见人列表 */
    List<String> visibleAccounts;
    /** 合同 */
    private List<ContractDTO> contracts;
}
