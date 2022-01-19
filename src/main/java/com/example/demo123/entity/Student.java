package com.example.demo123.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
@Data
public class Student {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer age;
    private String address;
    private String email;


    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
