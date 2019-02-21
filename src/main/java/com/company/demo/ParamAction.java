package com.company.demo;

import com.sun.istack.internal.Interned;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParamAction {
    //基本数据类型
    @RequestMapping("test_int.do")
    @ResponseBody
    public String testInt(int a){
        return "<h1>param:"+a+"</h1>";

    }
    @RequestMapping("test_wrapper.do")
    @ResponseBody
    public String testInteger (Integer a){
        return "<h1>param:"+a+"</h1>";
    }
    @RequestMapping("test_more.do")
    @ResponseBody
    public String testMore (Integer id,String name,Double sal){
        return "person:"+id+":"+name+":"+sal;
    }
    @RequestMapping("test_object.do")
    @ResponseBody
    public String testObject (Person xudong){
    System.out.println(xudong);
    return "person:"+xudong;
    }
    @RequestMapping("test_Injection.do")
    @ResponseBody
    public String testInjection (Person mengmeng){
        return "Person+Phone"+mengmeng;
    }
    @RequestMapping("test_owsa.do")
    @ResponseBody
    public String test_ObjectWithSameAttribute (@ModelAttribute("phone") Phone phone,@ModelAttribute("pc") PC pc){
        return phone +"*****"+pc;
    }
    @InitBinder("phone")
    public void initPhone(WebDataBinder binder){
        binder.setFieldDefaultPrefix("phone.");

    }
    @InitBinder("pc")
    public void initPc(WebDataBinder binder){
        binder.setFieldDefaultPrefix("pc.");
    }


}
