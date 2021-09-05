package com.gaotong.smart.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author suouyang
 * @since 2021-08-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="RecruitmentinfoCategory对象", description="")
public class RecruitmentinfoCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cid;

    private String name;

    private Date createTime;

    private Date modifiedTime;


}
