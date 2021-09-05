package com.gaotong.smart.controller;


import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.ProductCategory;
import com.gaotong.smart.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @since 2021-08-25
 */
@RestController
@RequestMapping("/smart/product-category")
public class ProductCategoryController {
@Autowired
    ProductCategoryService productCategoryService;
    @GetMapping("selectCategory")
    public Result selectCategory(){
        List<ProductCategory> categories = productCategoryService.list(null);
        return Result.ok().data("data",categories);
    }


}

