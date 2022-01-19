package com.example.demo123;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo123.Usermapper.StudentMapper;
import com.example.demo123.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class WrapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void testUseByWrapper(){
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        wrapper
                .isNotNull("name")
                .ge("age",20);
        studentMapper.selectList(wrapper).forEach(System.out::println);
    }

}
