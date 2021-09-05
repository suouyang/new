package com.gaotong.smart.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-08-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProductParameter对象", description="")
public class ProductParameter implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pid",type = IdType.ID_WORKER_STR)
    private String pid;

    private String dimensions;

    private String weight;

    private String loading;

    private String wheelbase;

    private String speed;

    private String endurance;

    private String mileage;

    private String detectionTime;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date modifiedTime;


}
