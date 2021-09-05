package com.gaotong.smart.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gaotong.smart.entity.ProductInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gaotong.smart.entity.vo.ProductQuery;
import com.gaotong.smart.entity.vo.ProductVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//import org.springframework.data.repository.query.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author suouyang
 * @since 2021-08-24
 */
@Mapper
public interface ProductInfoMapper extends BaseMapper<ProductInfo> {

  public IPage<ProductVo> getProductVo(IPage<ProductVo> page, @Param("productQuery")ProductQuery productQuery);

}
