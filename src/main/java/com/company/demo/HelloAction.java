package com.company.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloAction {
   @RequestMapping("hello.do")
    public String myhello (){
        System.out.println("***********");
        return "helloKitty";
    }
    @RequestMapping("hello2.do")
    public String myhello2 (){
        return "helloKitty2";
    }

}
