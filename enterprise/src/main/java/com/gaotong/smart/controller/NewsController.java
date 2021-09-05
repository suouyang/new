package com.gaotong.smart.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.News;
import com.gaotong.smart.entity.vo.NewsInfo;
import com.gaotong.smart.service.NewsCategoryService;
import com.gaotong.smart.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import com.gaotong.smart.entity.vo.NewsQuery;
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
@RequestMapping("smartnews/news")
public class NewsController {
@Autowired
NewsService newsService;
NewsCategoryService newsCategoryService;
 @GetMapping("selectAll/{page}/{limit}")
    public Result selectAll(@PathVariable Long page,@PathVariable Long limit){
     Page<News> newsPage = new Page<>(page, limit);

      newsService.page(newsPage,null);
     Long total = newsPage.getTotal();
     List<News> records = newsPage.getRecords();
//     System.out.println(total);
     return Result.ok().data("rows",records).data("total",total);


 }
 @PostMapping("selectAllCondition/{page}/{limit}")

 public Result selectAllCondition(@PathVariable Long page,@PathVariable Long limit,@RequestBody(required = false) NewsQuery newsQuery){
     Page<News> newsQueryPage = new Page<>(page,limit);
//     QueryWrapper<News> queryWrapper = new QueryWrapper<>();
//
//     String title = newsQuery.getTitle();
//     String name = newsQuery.getName();
//
//     String begin = newsQuery.getBegin();
//
//     String end = newsQuery.getEnd();
//       if(!StringUtils.isEmpty(title)){
//           queryWrapper.like("title",title);
//       }
////     if(!StringUtils.isEmpty(name)){
////         queryWrapper.eq("name",name);
////     }
//       if(!StringUtils.isEmpty(begin)){
//           queryWrapper.ge("create_time",begin);
//
//       }
//     if(!StringUtils.isEmpty(end)){
//         queryWrapper.le("create_time",end);
//
//     }
//     queryWrapper.orderByDesc("create_time");
     newsService.getNewsVo(newsQueryPage,newsQuery);
     long total = newsQueryPage.getTotal();
     List<News> records = newsQueryPage.getRecords();
     return Result.ok().data("total",total).data("rows",records);

 }



 @DeleteMapping("delete/{id}")

    public Result deleteById(@PathVariable String id){

     boolean flag = newsService.removeById(id);
     if(flag){
         return Result.ok();
     }else{
         return Result.error();
     }
 }

 @PostMapping("addNews")
    public Result addNews(@RequestBody(required = false) News news){
     boolean flag = newsService.save(news);
     if(flag){
         return Result.ok();
     }else{
         return Result.error();
     }

 }
 @GetMapping("selectNewsById/{id}")
    public Result selectNewsById(@PathVariable String id){
     NewsInfo news = newsService.getNewsById(id);
     return Result.ok().data("data",news);
 }

 @GetMapping("selectNewsByCategoryId/{cid}")
 public Result selectNewsByCategoryId(@PathVariable String cid){
     QueryWrapper<News> newsQueryWrapper = new QueryWrapper<>();
     newsQueryWrapper.eq("cid",cid);
     newsQueryWrapper.last("limit 6");
     List<News> list = newsService.list(newsQueryWrapper);
     return Result.ok().data("data",list);

 }


 @PostMapping("updateNews")
    public  Result updateNews(@RequestBody(required = false) News newsinfo){
     boolean flag = newsService.updateById(newsinfo);
     if(flag){
         return Result.ok();
     }
     else{
         return Result.error();
     }


 }





}

