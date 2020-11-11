package com.guo.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Guosh
 * @Date: 2020/9/7 15:06
 */
@RestController
@RequestMapping(path = { "/demo"})
public class DemoController {
    @RequestMapping(value = "/test1")
    public String test(){
        return "hello";
    }
}
