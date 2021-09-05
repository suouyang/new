package com.gaotong.smart.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 
 * </p>
 *
 * @author suouyang
 * @since 2021-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(type =IdType.ID_WORKER_STR )
    private String id;
    @NotBlank(message = "你的用户名不能为空")
    private String userName;

    @NotBlank(message = "你的密码不能为空")
    private String password;

    private String avatar;

    private Integer status;
    private  Date  lastLogin;

    private String email;







}
