package ie.williamswalsh.rabbitmq_messaging.controller;

import ie.williamswalsh.rabbitmq_messaging.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageSenderController {

    @Autowired
    MessageSender messageSender;

    @PostMapping(value = "/send")
    public ResponseEntity<String> send(@RequestBody String messageToSend) {
        messageSender.send(messageToSend);
        return new ResponseEntity<>("Message Requested for sending" + messageToSend, HttpStatus.OK);
    }
}

