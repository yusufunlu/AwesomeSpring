package com.yusufu.awesomespring.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "topic0", groupId = "yusufu_group_id")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

    @KafkaListener(topics = "topic1")
    public void listen(
            ConsumerRecord<String, String> record,
            Acknowledgment acknowledgment,
            @Headers Map<String, Object> headers) {

            String message = record.value();
            long timestamp = record.timestamp();

            System.out.println("Received message: " + message);
            System.out.println("Timestamp: " + timestamp);

            // Access other headers if needed
            for (Map.Entry<String, Object> entry : headers.entrySet()) {
                String headerKey = entry.getKey();
                Object headerValue = entry.getValue();
                System.out.println("Header: " + headerKey + " = " + headerValue);
            }

            // Manually acknowledge the message
            acknowledgment.acknowledge();
    }

    @KafkaListener(id = "id1", topics = "topic2")
    public void listen(String in) {
        System.out.println(in);
    }
}
