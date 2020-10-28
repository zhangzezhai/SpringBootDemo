package com.zzz.controller;

import com.zzz.domain.LearnResouce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/learn")
public class LearnResourceController {

    @RequestMapping("")
    public ModelAndView index(){

        List<LearnResouce> learnList =new ArrayList<LearnResouce>();
        LearnResouce bean =new LearnResouce("3个z","公众号地址","https://mp.weixin.qq.com/s/bhYTVpFrVJcVX9WIydmmTA");
        learnList.add(bean);
        bean =new LearnResouce("3个Z","项目地址","https://github.com/zhangzezhai/SpringBootDemo.git");
        learnList.add(bean);

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }

    @RequestMapping("/t")
    public ModelAndView index2(){

        List<LearnResouce> learnList =new ArrayList<LearnResouce>();
        LearnResouce bean =new LearnResouce("3个z","公众号地址","https://mp.weixin.qq.com/s/bhYTVpFrVJcVX9WIydmmTA");
        learnList.add(bean);
        bean =new LearnResouce("3个Z","项目地址","https://github.com/zhangzezhai/SpringBootDemo.git");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/template");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }


}
