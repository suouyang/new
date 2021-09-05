package com.gaotong.smart.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gaotong.smart.entity.News;
import com.gaotong.smart.mapper.NewsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = NewsMapper.class)
public class NewsServiceTest {
    @Autowired
    NewsService newsService;
    @Test
    public void test() throws FileNotFoundException {
        String path = ResourceUtils.getURL("classpath:").getPath();

        System.out.println(path);
        }

    }

