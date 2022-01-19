package com.example.demo123;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo123.Usermapper.StudentMapper;
import com.example.demo123.entity.Student;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class Demo123ApplicationTests {
    @Resource
     private StudentMapper studentMapper;



    /*
    查询操作
     */
   @Test
    public void testSelect(){
         System.out.println("---Haha-----");
         List<Student> studentList=studentMapper.selectList(null);
         for (Student student : studentList){
             System.out.println(student);
         }
     }

     /*
     查询单个名字
      */
    @Test
    public void testSelectByName()
    {
        System.out.println("---Select By Name---");
        HashMap<String,Object> map =new HashMap<>();
        map.put("name","mn");
        List<Student> students=studentMapper.selectByMap(map);
        System.out.println(students);

    }

      /*
      *插入操作
      */
     @Test
    public void testInsert(){
       System.out.println("--This is to insert something to table--");
        Student student_01=new Student();
//            student_01.setId(37);
            student_01.setName("chaxun");
            student_01.setAge(1032);
            student_01.setAddress("se3321re");
            student_01.setEmail("113213210.com");
            studentMapper.insert(student_01);

         }


    /*
    通过主键来更新数据库
     */
         @Test
    public void testUpdateById(){
       Student student_02=new Student();
       long l=new Long ((long)2021);//进行强制类型转换
       student_02.setId(l);
       student_02.setAddress("Everywhere");
       student_02.setEmail("110@11.c0m");
       studentMapper.updateById(student_02);
         }

    /*
    通过主键进行删除
     */
         @Test
    public void testDeleteById(){
             studentMapper.deleteById(110);
         }

         /*
         通过Map删除
          */
    @Test
    public void testDeleteByMap(){
        HashMap<String,Object> map=new HashMap<>();
        map.put("name","m2n332");
        studentMapper.deleteByMap(map);
    }
/*
分页查询
 */
         @Test
    public void testPage(){
             System.out.println("---This is Select By Page---");
             Page<Student> page =new Page<>(1,5);
             studentMapper.selectPage(page,null);
             page.getRecords().forEach(System.out::println);
         }
}



