package com.gaotong.smart.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gaotong.smart.entity.News;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gaotong.smart.entity.vo.NewsInfo;
import com.gaotong.smart.entity.vo.NewsQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author suouyang
 * @since 2021-08-05
 */
@Service
public interface NewsService extends IService<News> {

    IPage<News> getNewsVo(IPage<News> page, @Param("newsQuery") NewsQuery newsQuery);
    NewsInfo getNewsById(String id);




}
