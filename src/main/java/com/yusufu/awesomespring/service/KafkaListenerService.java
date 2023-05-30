package com.yusufu.awesomespring.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

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
            @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
            @Header(KafkaHeaders.OFFSET) long offset,
            //@Header(KafkaHeaders.TIMESTAMP_TYPE) String timestampType,
            @Header(KafkaHeaders.TIMESTAMP) long timestamp,
            @Header(KafkaHeaders.CONSUMER) KafkaConsumer<?, ?> consumer) {

        String key = record.key();
        String value = record.value();

        // Process the message and its parameters
        System.out.println("Received message: " + value);
        System.out.println("Received key: " + key);
        System.out.println("Topic: " + topic);
        System.out.println("Partition: " + partition);
        System.out.println("Offset: " + offset);
        //System.out.println("Timestamp Type: " + timestampType);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Consumer: " + consumer);

        // Acknowledge the message manually if using manual acknowledgments
        acknowledgment.acknowledge();
    }

    @KafkaListener(id = "id1", topics = "topic2")
    public void listen(String in) {
        System.out.println(in);
    }
}
