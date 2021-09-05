//package com.gaotong.smart.mapper;
//
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.gaotong.smart.commonutils.Result;
//import com.gaotong.smart.entity.ProductCategory;
//import com.gaotong.smart.entity.ProductInfo;
//import com.gaotong.smart.entity.ProductParameter;
//import com.gaotong.smart.entity.vo.ProductQuery;
//import com.gaotong.smart.entity.vo.ProductVo;
//import com.gaotong.smart.service.ProductInfoService;
//import com.gaotong.smart.service.ProductParameterService;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@Slf4j
//public class ProductInfoMapperTest {
//@Autowired
//ProductInfoMapper productInfoMapper;
//    @Autowired
//ProductInfoService productInfoService;
//@Autowired
//ProductCategoryMapper productCategoryMapper;
//    @Autowired
//    ProductParameterService productParameterService;
//@Autowired
//ProductParameterMapper productParameterMapper;
//
//    @Test
//    public void test(){
//        Page<ProductVo> productVoPage = new Page<>(1,4);
//        ProductQuery productQuery = new ProductQuery();
//        productQuery.setName("");
//        productInfoMapper.getProductVo(productVoPage, productQuery);
//        long total = productVoPage.getTotal();
//        System.out.println(total);
//    }
//
//    @Test
//    public void test1(){
//        ProductInfo productInfo = productInfoMapper.selectById(1);
////        System.out.println(productInfo);
//        ProductVo productVo = new ProductVo();
//        BeanUtils.copyProperties(productInfo,productVo);
//        String cid = productInfo.getCid();
//        System.out.println(cid);
//        ProductCategory productCategory = productCategoryMapper.selectById(cid);
//        String categoryName = productCategory.getCategoryName();
//        productVo.setCategoryName(categoryName);
////        System.out.println(productCategory);
//        System.out.println(productVo);
//
////        log.info("-------------");
//    }
//    @Test
//    public void test2(){
//        ProductInfo productInfo = new ProductInfo();
//
//        ProductVo productVo = new ProductVo();
//
//        BeanUtils.copyProperties(productVo,productInfo);
//
//        ProductParameter productParameter = new ProductParameter();
//
//            BeanUtils.copyProperties(productVo, productParameter);
//            String pid = productVo.getPid();
//            productParameter.setId(pid);
//            boolean flag1 = productInfoService.save(productInfo);
//            boolean flag2 = productParameterService.save(productParameter);
//            System.out.println(productVo);
//            if (flag1 && flag2) {
//                System.out.println("true");
//
//            }
//        }
//
//
//
//
//
//
//    }
//
//
////    @Test
////    public void test3(){
////        ProductParameter productParameter = productParameterMapper.selectById(1);
////        System.out.println(productParameter);
////
////    }
//
//
