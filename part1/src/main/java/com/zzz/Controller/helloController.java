package com.zzz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
    @ResponseBody
    @RequestMapping("/api")
    public  String helloFun(){
        return "hello word !";
    }

}
