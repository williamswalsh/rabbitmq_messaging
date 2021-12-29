package ie.williamswalsh.rabbitmq_messaging.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

    @RabbitListener(queues = "${spring.rabbitmq.orderqueue}")
    public void receiveMessage(String message) {
        System.out.println("Message Received: " + message);
    }
}
