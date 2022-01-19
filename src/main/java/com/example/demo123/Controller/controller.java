package com.example.demo123.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @RequestMapping("/")
    @ResponseBody
    String test_one(){
        return "Hello world";
    }
}
