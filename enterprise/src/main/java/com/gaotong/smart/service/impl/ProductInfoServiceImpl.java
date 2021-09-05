package com.gaotong.smart.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gaotong.smart.entity.ProductCategory;
import com.gaotong.smart.entity.ProductInfo;
import com.gaotong.smart.entity.dto.OneSubject;
import com.gaotong.smart.entity.dto.TwoSubject;
import com.gaotong.smart.entity.vo.ProductQuery;
import com.gaotong.smart.entity.vo.ProductVo;
import com.gaotong.smart.mapper.ProductCategoryMapper;
import com.gaotong.smart.mapper.ProductInfoMapper;
import com.gaotong.smart.service.ProductInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author suouyang
 * @since 2021-08-24
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements ProductInfoService {
@Autowired
ProductInfoMapper productInfoMapper;
@Autowired
    ProductCategoryMapper productCategoryMapper;
    @Override
    public IPage<ProductVo> getProductVo(IPage<ProductVo> page, @Param("productQuery") ProductQuery productQuery) {
        return productInfoMapper.getProductVo(page,productQuery);
    }

    @Override
    public List<OneSubject> selectSubject() {
        List<ProductCategory> categories = productCategoryMapper.selectList(null);
        System.out.println(categories);

        List<OneSubject> finalList = new ArrayList<OneSubject>();
        List<ProductInfo> productInfos = productInfoMapper.selectList(null);


        for (ProductCategory productCategory:categories
             ) {

            OneSubject oneSubject = new OneSubject();
            String cid = productCategory.getCid();
            String categoryName = productCategory.getCategoryName();
            oneSubject.setId(cid);
            oneSubject.setName(categoryName);
//            System.out.println(oneSubject);
            finalList.add(oneSubject);
            List<TwoSubject> twoSubjectList=new ArrayList<TwoSubject>();
            for (ProductInfo productInfo:productInfos) {
                TwoSubject twoSubject=new TwoSubject();
                 if(productInfo.getCid().equals(cid)){
                  BeanUtils.copyProperties(productInfo,twoSubject);
                  twoSubjectList.add(twoSubject);
                }
            }
            oneSubject.setTwoSubjects(twoSubjectList);

        }


        return finalList;
    }
}
