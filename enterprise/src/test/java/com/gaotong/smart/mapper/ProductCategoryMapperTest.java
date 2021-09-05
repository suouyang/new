package com.gaotong.smart.mapper;

import com.gaotong.smart.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {
@Autowired
ProductCategoryMapper productCategoryMapper;
    @Test
    public void test() throws FileNotFoundException {
      String path = ResourceUtils.getURL("classpath:").getPath();
        System.out.println(path);
    }
}