package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name){
        System.out.println("user save ..."+name);
        return "{'model':'springmvc'}";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String[] name){
        System.out.println("user delete ..."+ Arrays.toString(name));
        return "{'model':'springmvc'}";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(String name){
        System.out.println("user update ..."+name);
        return "{'model':'springmvc'}";
    }
}
