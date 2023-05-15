package com.example.active;

import com.example.active.activemq.Queue_Consume;
import com.example.active.activemq.Queue_Produce;
import com.example.active.mysql.controller.MysqlController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.JMSException;

@SpringBootApplication
public class ActiveApplication {

    public static void main(String[] args) throws JMSException {
//        Queue_Produce x=new Queue_Produce();
//        x.produce();
//        Queue_Consume y=new Queue_Consume();
//        y.consume();
        SpringApplication.run(ActiveApplication.class, args);
    }

}
