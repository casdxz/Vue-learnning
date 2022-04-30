package com.bear.web.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: bear
 * @create: 2022-04-08 08:42
 **/
@RestController
public class HelloController {
    @GetMapping("hello")
    public String getHello() {
        return "Hello SpringBoot!";
    }
}
