package com.example.demo.Service.impl;

import com.example.demo.Service.BusinessService;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessImpl implements BusinessService{

    @Autowired
    StudentMapper mapper;
    @Override
    public Student getStudent(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

//    @Autowired
//    PerformProdRuleMapper mapper;
//
//    @Override
//    public List<PerformProdRule> getBusinessData(Long id) {
//        List<PerformProdRule> list = new ArrayList<>();
//        PerformProdRule performProdRule = mapper.selectByPrimaryKey(id);
//
//        if(performProdRule != null){
//            list.add(performProdRule);
//            return list;
//        }else{
//            return  null;
//        }
//    }
}
