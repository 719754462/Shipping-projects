package com.example.active.mysql.controller;

import com.example.active.activemq.Queue_Produce;
import com.example.active.mysql.dao.UserRepository;
import com.example.active.mysql.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MysqlController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> findAll() throws JMSException {
        Queue_Produce pro =new Queue_Produce();
        List<User> result = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        userRepository.findAll().forEach((user) -> {
            result.add(user);
//            strList.add(user.getName());
//            strList.add(user.getSex());
//            strList.add(user.getBirth());
//            strList.add(user.getBirthaddr());
        });
//        pro.produce(strList);
        return result;
    }
}
