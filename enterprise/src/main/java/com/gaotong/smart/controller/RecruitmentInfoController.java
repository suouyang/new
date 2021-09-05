package com.gaotong.smart.controller;


import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.RecruitmentInfo;
import com.gaotong.smart.service.RecruitmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-08-05
 */
@RestController
@CrossOrigin
@RequestMapping("/smart/recruitment-info/")
public class RecruitmentInfoController {
    @Autowired
    RecruitmentInfoService recruitmentInfoService;
    @GetMapping("selectrecruitmentInfoById/{id}")
    public Result selectrecruitmentInfoById(@PathVariable String id){
        RecruitmentInfo recruitmentInfo = recruitmentInfoService.getById(id);
        return Result.ok().data("data",recruitmentInfo);
    }


    @GetMapping("selectrecruitmentInfo")
    public Result selectrecruitmentInfo(){
        List<RecruitmentInfo> list = recruitmentInfoService.list(null);
        return Result.ok().data("data",list);
    }
    @PostMapping("addrecruitmentInfo")
    public Result addrecruitmentInfo(@RequestBody RecruitmentInfo recruitment){
        boolean flag = recruitmentInfoService.save(recruitment);
        if(flag){
            return  Result.ok();
        }else{
            return  Result.error();
        }

    }
    @DeleteMapping("deleterecruitmentInfo/{id}")
    public Result deleterecruitmentInfo(@PathVariable String id){
        boolean flag = recruitmentInfoService.removeById(id);
        if(flag){
            return Result.ok();
        }else{
            return Result.error();
        }
    }
    @PostMapping("updaterecruitmentInfo")
    public Result updaterecruitmentInfo(@RequestBody RecruitmentInfo recruitment){
        boolean flag = recruitmentInfoService.updateById(recruitment);
        if(flag){
            return Result.ok();
        }else{
            return Result.error();
        }
    }


}

