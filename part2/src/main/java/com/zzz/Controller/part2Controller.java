package com.zzz.Controller;

import com.zzz.domain.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class part2Controller {
    @Value("${com.zzz.name}")
    private String name;

    @Value("${com.zzz.type}")
    private String type;

    //使用Bean文件调用配置信息：使用与配置属性较多时使用，不用像上面一个一个写了
    @Autowired
    ConfigBean configBean;

    @ResponseBody
    @RequestMapping("/part2")
    public String testPart2(){
//        return name + type;
        return configBean.getName()+configBean.getType();

    }

}
