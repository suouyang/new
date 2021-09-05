package com.gaotong.smart.entity.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;



@Data
public class OneSubject {
    private String id;

    private String name;

    List<TwoSubject> twoSubjects= new ArrayList<TwoSubject>();

}
