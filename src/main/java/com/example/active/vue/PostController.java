package com.example.active.vue;

import com.example.active.activemq.Queue_Consume;
import com.example.active.activemq.Queue_Produce;
import com.example.active.mysql.dao.NumRepository;
import com.example.active.mysql.pojo.Num;
import com.example.active.mysql.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/user")
public class PostController {
    @Autowired
    private NumRepository numRepository;

    @RequestMapping(value = "/show")
    public List<Num> show() throws JMSException {
        List<Num> result = new ArrayList<>();
        Queue_Consume pro =new Queue_Consume();
        numRepository.findAll().forEach((num) -> {
            result.add(num);
        });
        pro.consume();
        return result;
    }
    @RequestMapping(value = "/data")
    public List<String> data() throws JMSException {
        Queue_Consume pro =new Queue_Consume();
        return pro.consume();
    }

//    @PostMapping(value = "/getUser")
//    public String getUser(Integer id, Model model) {
//        User user = userRepository.selectUserById(id);
//        model.addAttribute("users",user);
//        if(user!=null){
//            return "getUser";
//        }else {
//            return "error";
//        }
//    }
}
