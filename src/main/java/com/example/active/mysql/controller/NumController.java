package com.example.active.mysql.controller;

import com.example.active.activemq.Queue_Consume;
import com.example.active.activemq.Queue_Produce;
import com.example.active.mysql.dao.NumRepository;
import com.example.active.mysql.pojo.Num;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NumController {
    @Autowired
    private NumRepository numRepository;

    @GetMapping("/nums")
    public List<String> findAll() throws JMSException {
        //result是为了向web显示，strList和pro是为了向python端通信
        Queue_Produce pro =new Queue_Produce();
//        List<Num> result = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        numRepository.findAll().forEach((num) -> {
//            result.add(num);
            strList.add(num.toString());
//            strList.add(user.getName());
//            strList.add(user.getSex());
//            strList.add(user.getBirth());
//            strList.add(user.getBirthaddr());
        });
        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }
        pro.produce(strList);
        return strList;
    }
}
