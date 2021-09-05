package com.gaotong.smart.controller;


import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.RecruitmentinfoCategory;
import com.gaotong.smart.service.RecruitmentinfoCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-08-23
 */
@RestController
@CrossOrigin
@RequestMapping("/smart/recruitmentinfo-category")
public class RecruitmentinfoCategoryController {
    @Autowired
    RecruitmentinfoCategoryService recruitmentinfoCategoryService;
    @GetMapping("selectAllCategory")
    public Result selectAllCategory(){
        List<RecruitmentinfoCategory> list = recruitmentinfoCategoryService.list(null);
        return Result.ok().data("data",list);
    }

}

