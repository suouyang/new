package com.gaotong.smart.entity.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.gaotong.smart.entity.News;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class NewsInfo implements Serializable{


    private String id;

    private String title;

    private String cid;

    private String name;

    private String content;

    private String image;

    private String description;



    private Date createTime;

    private Date modifiedTime;


}
