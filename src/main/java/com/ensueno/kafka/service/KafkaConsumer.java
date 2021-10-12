package com.ensueno.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="test-topic", groupId="foo")
    public void consume(String message) throws IOException {
        System.out.println("Consumer=" + message);
    }

}
