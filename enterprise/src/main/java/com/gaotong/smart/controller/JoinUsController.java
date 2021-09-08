package com.gaotong.smart.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.JoinUs;
import com.gaotong.smart.service.JoinUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-09-08
 */
@RestController
@RequestMapping("/smart/join-us")
public class JoinUsController {

    @Autowired
    JoinUsService joinUsService;
    @GetMapping("selectJoin")
    public Result selectJoin(){
        QueryWrapper<JoinUs> wrapper = new QueryWrapper<JoinUs>();
        JoinUs one = joinUsService.getOne(wrapper);
        return Result.ok().data("data",one);


    }


}

