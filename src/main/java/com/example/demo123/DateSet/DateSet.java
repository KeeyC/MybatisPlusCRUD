package com.example.demo123.DateSet;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class DateSet implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject){
    this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);

    }
    public void updateFill(MetaObject metaObject){
        this.setFieldValByName("updateTime",new Date(),metaObject);

    }
}