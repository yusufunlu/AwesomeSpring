package com.yusufu.awesomespring.controller;

import com.yusufu.awesomespring.config.KafkaConsumerConfig;
import com.yusufu.awesomespring.config.KafkaProducerConfig;
import org.apache.kafka.clients.admin.TopicDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerConfig kafkaProducerConfig;

    @Autowired
    private KafkaAdmin kafkaAdmin;

    @GetMapping(value = "/send")
    public String send(@RequestParam(value = "topic", required = false) String topic,
                       @RequestParam(value = "key", required = false) String key,
                       @RequestParam(value = "message", required = false) String message) {

        kafkaProducerConfig.send(topic,key,message);
        return "Hello World";
    }
    @PostMapping(value = "/describeTopics")
    public String describeTopics(@RequestBody String topic) {

        return kafkaAdmin.describeTopics(topic).get(topic).toString();
    }
}
