package com.example.kafkabl9t;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "claim_test",
                groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("listener receive" + data + ".");

    }
}
