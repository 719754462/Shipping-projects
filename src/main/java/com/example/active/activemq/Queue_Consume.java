package com.example.active.activemq;


import javax.jms.*;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Queue_Consume {
    //监听注册,指定需要监听得队列
    public static final String ACTIVEMQ_URL = "tcp://127.0.0.1:61616";
    // 消息队列名称
    public static final String QUEUE_NAME = "queue01";
    //private static final String username = "111";
    //private static final String password = "111";

    //public static CopyOnWriteArraySet<Connection> ConsumerConnectionSet = new CopyOnWriteArraySet<Connection>();

    public void consume() throws JMSException {
        //1. 创建ConnectionFactory
        //ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(username,password,url);
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        //2. 创建Connection
        Connection connection = connectionFactory.createConnection();
        //3. 启动连接
        connection.start();
        //4. 创建会话
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5. 创建一个目标
        Destination destination = session.createQueue(QUEUE_NAME);
        //6. 创建一个消费者
        MessageConsumer consumer = session.createConsumer(destination);
        //7. 创建一个监听器
        //ConsumerConnectionSet.add(connection);
        consumer.setMessageListener(new MessageListener() {
            public void onMessage(Message message) {
                try {
                    String messageText = ((TextMessage) message).getText();
//                        此处应想办法改为bytemessage
                    System.out.println("接收消息  = [" + messageText + "]");

                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
//            目前的话调用会直接默认清空队列
//            consumer.close();
//            session.close();
//            connection.close();
//            System.out.println("success.....");
    }
}