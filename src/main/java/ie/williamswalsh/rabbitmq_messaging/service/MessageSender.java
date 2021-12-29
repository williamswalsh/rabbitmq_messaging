package ie.williamswalsh.rabbitmq_messaging.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    @Autowired
    RabbitTemplate rabbit;

    @Value("${spring.rabbitmq.orderqueue}")
    String rabbitRoutingKey;

    public void send(String message) {
        rabbit.convertAndSend(rabbitRoutingKey, message);
    }
}
