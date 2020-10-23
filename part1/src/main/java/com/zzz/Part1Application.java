package com.zzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Part1Application {

    //程序入口函数
    public static void main(String[] args) {
        SpringApplication.run(Part1Application.class, args);
    }

//    @RequestMapping("/")
//    public String index(){
//        return "hello springboot !";
//    }


}
