package com.gaotong.smart.controller;


import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.ProductParameter;
import com.gaotong.smart.service.ProductParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-08-24
 */
@RestController
@RequestMapping("/smart/product-parameter")
public class ProductParameterController {
    @Autowired
    ProductParameterService productParameterService;
    @PostMapping("addProductParameter")
    public Result addProductParameter(@RequestBody ProductParameter productParameter){
        boolean flag = productParameterService.save(productParameter);
        if(flag){
            return Result.ok();
        }else{
            return Result.error();
        }

    }

}

