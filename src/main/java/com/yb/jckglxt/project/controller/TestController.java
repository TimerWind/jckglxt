package com.yb.jckglxt.project.controller;

import com.yb.jckglxt.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019-06-12.
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public void test(){

        System.out.println(testService.test());
    }


}
