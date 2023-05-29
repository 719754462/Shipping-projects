package com.example.active;

import com.example.active.activemq.Queue_Consume;
import com.example.active.activemq.Queue_Produce;
import com.example.active.matlab.matlab_test;
import com.example.active.mysql.controller.MysqlController;
import com.mathworks.toolbox.javabuilder.MWException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ActiveApplication {

    public static void main(String[] args) throws JMSException, MWException {
//        List<String> strList=new ArrayList();
//        strList.add("1 2 3 4 0");
//        strList.add("5 2 3 4 0");
//        strList.add("1 6 9 4 0");
//        Queue_Produce x=new Queue_Produce();
//        x.produce(strList);

//        Queue_Consume y=new Queue_Consume();
//        y.consume();

        SpringApplication.run(ActiveApplication.class, args);

//        matlab_test exp =new matlab_test();
//        exp.test();
    }

}
