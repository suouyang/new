package com.gaotong.smart.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gaotong.smart.entity.News;
import com.gaotong.smart.entity.vo.NewsInfo;
import com.gaotong.smart.entity.vo.NewsQuery;
import com.gaotong.smart.mapper.NewsMapper;
import com.gaotong.smart.service.NewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author suouyang
 * @since 2021-08-05
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

@Autowired
NewsMapper newsMapper;


    @Override
    public IPage<News> getNewsVo(IPage<News> page, NewsQuery newsQuery) {
        return newsMapper.getNewsVo(page,newsQuery);
    }

    @Override
    public NewsInfo getNewsById(String id) {
        return newsMapper.getNewsById(id);

    }
}

