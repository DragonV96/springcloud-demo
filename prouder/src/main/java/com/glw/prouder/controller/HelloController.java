package com.glw.prouder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : glw
 * @date : 2019/6/25
 * @time : 16:40
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "Hello~ " + name + "，这是第一条消息。";
    }
}
