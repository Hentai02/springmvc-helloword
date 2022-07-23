package com.example.controller;

import com.example.dao.UserDaoImpl;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
public class HelloController {

    //Logger logger = Logger.getLogger(this.getClass().getName());

    private final UserDaoImpl userDaoImpl;

    @Autowired
    public HelloController(UserDaoImpl userDaoImpl){
        this.userDaoImpl = userDaoImpl;
    }

    @RequestMapping(value = "/hello-world",method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("helloworld","你好世界！");
        return "helloworld";

    }

    @ResponseBody
    @GetMapping("/getUser")
    public Map<String,Object> getUser(){
        User user = userDaoImpl.getUser();
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        return map;
    }



}