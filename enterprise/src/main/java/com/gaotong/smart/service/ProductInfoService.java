package com.gaotong.smart.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gaotong.smart.entity.ProductInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gaotong.smart.entity.dto.OneSubject;
import com.gaotong.smart.entity.vo.ProductQuery;
import com.gaotong.smart.entity.vo.ProductVo;
import com.gaotong.smart.mapper.ProductInfoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author suouyang
 * @since 2021-08-24
 */
public interface ProductInfoService extends IService<ProductInfo> {


   public IPage<ProductVo> getProductVo(IPage<ProductVo> page, @Param("productQuery") ProductQuery productQuery);

    List<OneSubject> selectSubject();
}
