package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.BusinessService;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;


@RestController
public class MyController {

    @Autowired
    BusinessService businessService;

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("/index")
    public int getModel(Integer id){

        Student student = businessService.getStudent(id);
        redisTemplate.opsForValue().set("s","AAAAAAAAA",10000, TimeUnit.DAYS.SECONDS);
        redisTemplate.opsForValue().set("student",student,10000, TimeUnit.DAYS.SECONDS);


        return 0;
    }
}
