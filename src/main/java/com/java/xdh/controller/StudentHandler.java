package com.java.xdh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/12 0012
 */
@RestController
@RequestMapping("/info")
public class StudentHandler {

    String message = "Hello World";
    @GetMapping("/index")
    public String index(){
        return message;
    }
}
