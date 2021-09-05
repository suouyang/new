package com.gaotong.smart.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class NewsQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "新闻标题")

    private String title;

    private String name;

    @ApiModelProperty(value = "查询开始时间", example = "2019-01-01 ")
    private String begin;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换

    @ApiModelProperty(value = "查询结束时间", example = "2019-12-01")
    private String end;


}
