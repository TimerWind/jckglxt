package com.yb.jckglxt;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.yb.jckglxt.project.dao")
public class JckglxtApplication {

    public static void main(String[] args) {
        SpringApplication.run(JckglxtApplication.class, args);
//        AnnotationConfigApplicationContext cc = new AnnotationConfigApplicationContext(JckglxtApplication.class);
//        String[] nn = cc.getBeanDefinitionNames();
//        for(String name : nn){
//            System.out.println(name);
//        }

    }


}
