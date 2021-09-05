package com.gaotong.smart.controller;


import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.NewsCategory;
import com.gaotong.smart.service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-08-12
 */
@RestController
@CrossOrigin
@RequestMapping("/smartnews/news-category")
public class NewsCategoryController {
    @Autowired
    NewsCategoryService newsCategoryService;
    @GetMapping("selectCategory")
    public Result selectCategory(){
        List<NewsCategory> newsCategoryList = newsCategoryService.list(null);
        return Result.ok().data("rows",newsCategoryList);
    }
    @DeleteMapping("deleteCategory/{id}")
    public Result deleteCategory(@PathVariable String id){
        boolean flag = newsCategoryService.removeById(id);
        if(flag){
            return Result.ok();
        }else{
            return Result.error();
        }
    }
    @PostMapping("addCategory")
    public Result addCategory(@RequestBody NewsCategory newsCategory){
        boolean flag = newsCategoryService.save(newsCategory);
        if(flag){
            return Result.ok();
        }else{
            return Result.error();
        }

    }

}

