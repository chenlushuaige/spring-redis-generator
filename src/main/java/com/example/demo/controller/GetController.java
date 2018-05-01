package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), XXX有限公司
 * FileName: GetController
 * Author:   chenlu
 * Date:     2018/3/12 20:32
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class GetController {
    @Autowired
    RedisTemplate redisTemplate;
    @RequestMapping("get")
    public void getStudent(){
        Student student = (Student)redisTemplate.opsForValue().get("student");
        System.out.println(student.getSname());
    }
}
