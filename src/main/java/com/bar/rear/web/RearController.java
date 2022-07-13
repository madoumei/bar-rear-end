package com.bar.rear.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bryan
 * @version 1.0
 * @description: test
 * @date 2022/7/13 21:29
 */
@RestController
public class RearController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
