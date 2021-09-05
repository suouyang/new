package com.gaotong.smart.mapper;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gaotong.smart.entity.News;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gaotong.smart.entity.vo.NewsInfo;

import com.gaotong.smart.entity.vo.NewsQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author suouyang
 * @since 2021-08-05
 */
@Mapper
public interface NewsMapper extends BaseMapper<News>  {
//    @Select("select n.*,nc.name from news n join news_category nc on n.cid = nc.cid order by n.create_time DESC")
    IPage<News> getNewsVo(IPage<News> page, @Param("newsQuery")NewsQuery newsQuery);
    @Select("select * from news n join news_category nc on n.cid = nc.cid where id= #{id} order by n.create_time DESC")
    NewsInfo getNewsById(String id);

}
