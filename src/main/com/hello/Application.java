package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Application {
    @RequestMapping("/hi")
    public String showUserInfo(){

        return  "index";
    }


    @RequestMapping("/apps.do")
    public String showAction(){

        return  "Hello";
    }


    @RequestMapping("/news.do")
    public String showsAction(){

        return  "Hello";
    }
}



