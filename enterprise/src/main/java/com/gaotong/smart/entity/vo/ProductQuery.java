package com.gaotong.smart.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    private String categoryName;

    private String function;
}
