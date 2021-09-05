package com.gaotong.smart.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gaotong.smart.config.Result;

import com.gaotong.smart.entity.ProductCategory;
import com.gaotong.smart.entity.ProductInfo;
import com.gaotong.smart.entity.ProductParameter;
import com.gaotong.smart.entity.dto.OneSubject;
import com.gaotong.smart.entity.vo.ProductVo;
import com.gaotong.smart.entity.vo.ProductQuery;

import com.gaotong.smart.service.ProductCategoryService;
import com.gaotong.smart.service.ProductInfoService;
import com.gaotong.smart.service.ProductParameterService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-08-24
 */
@RestController
@CrossOrigin
@RequestMapping("/smart/product-info")
public class ProductInfoController {
    @Autowired
    ProductInfoService productInfoService;
    @Autowired
    ProductCategoryService productCategoryService;
    @Autowired
    ProductParameterService productParameterService;

    @PostMapping("selectAllCondition/{page}/{limit}")
    public Result selectAllCondition(@PathVariable long page, @PathVariable long limit, @RequestBody(required = false) ProductQuery productQuery) {
        Page<ProductVo> infoPage = new Page<ProductVo>(page, limit);
        productInfoService.getProductVo(infoPage, productQuery);
        long total = infoPage.getTotal();
        List<ProductVo> records = infoPage.getRecords();
        return Result.ok().data("total", total).data("data", records);
    }
    @GetMapping("selectSubject")
    public Result selectSubject(){
        List<OneSubject> list=productInfoService.selectSubject();
        return Result.ok().data("data",list);

    }

    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable String id) {
        ProductInfo productInfo = productInfoService.getById(id);
        String pid = productInfo.getPid();
        boolean flag = productInfoService.removeById(id);
        if (pid != null) {
            boolean flag1 = productParameterService.removeById(pid);
        }
        if (flag) {
            return Result.ok();
        } else {
            return Result.error();
        }
    }

    @GetMapping("selectById/{id}")
    public Result selectById(@PathVariable("id") String id) {
        ProductInfo productInfo = productInfoService.getById(id);

        if (productInfo!=null) {
            ProductVo productVo = new ProductVo();
            BeanUtils.copyProperties(productInfo, productVo);
            System.out.println(productVo);
            String cid = productInfo.getCid();
            ProductCategory productCategory = productCategoryService.getById(cid);
            String categoryName = productCategory.getCategoryName();
            productVo.setCategoryName(categoryName);
            String pid=productInfo.getPid();
            ProductParameter productParameter = productParameterService.getById(pid);
            BeanUtils.copyProperties(productParameter,productVo);
            System.out.println(productVo);
            return Result.ok().data("data", productVo);
        }
        return Result.error().message("id不存在");

    }

    @PostMapping("updateById")
    public Result UpdateById(@RequestBody(required = false) ProductVo productVo) {
        ProductInfo productInfo = new ProductInfo();
        ProductParameter productParameter = new ProductParameter();
        BeanUtils.copyProperties(productVo, productInfo);
        String pid = productInfo.getPid();
        BeanUtils.copyProperties(productVo, productParameter);
        productParameter.setPid(pid);
            boolean flag3 = productParameterService.updateById(productParameter);
            boolean flag1 = productInfoService.updateById(productInfo);

            if (flag1  && flag3) {
                return Result.ok();
            } else {
                return Result.error();
            }
        }



    @PostMapping("addProduct")
    public Result addProduct(@RequestBody(required = false) ProductVo productVo) {
        ProductInfo productInfo = new ProductInfo();
        ProductParameter productParameter = new ProductParameter();
        BeanUtils.copyProperties(productVo, productInfo);
        BeanUtils.copyProperties(productVo, productParameter);
//        String pid = productVo.getPid();
//        productParameter.setPid(pid);
        boolean flag1 = productInfoService.save(productInfo);
        boolean flag2 = productParameterService.save(productParameter);
        if (flag1 && flag2) {
            return Result.ok();
        } else {
            return Result.error();
        }
    }
}







