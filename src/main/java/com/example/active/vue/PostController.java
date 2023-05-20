package com.example.active.vue;

import com.example.active.mysql.dao.UserRepository;
import com.example.active.mysql.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/user")
public class PostController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/show")
    public List<User> show() {
        List<User> result = new ArrayList<>();
        userRepository.findAll().forEach((user) -> {
            result.add(user);
        });

        return result;
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
