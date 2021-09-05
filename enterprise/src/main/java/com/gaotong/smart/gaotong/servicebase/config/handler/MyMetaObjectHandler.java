package com.gaotong.smart.gaotong.servicebase.config.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {


        this.setFieldValByName("createTime",new Date(), metaObject);
        this.setFieldValByName("modifiedTime", new Date(), metaObject);

    }

    @Override
    public void updateFill(MetaObject metaObject) {

        this.setFieldValByName("modifiedTime",new Date(), metaObject);
    }


}