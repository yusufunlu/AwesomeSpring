package com.yusufu.awesomespring.controller;

import com.yusufu.awesomespring.config.KafkaConsumerConfig;
import com.yusufu.awesomespring.config.KafkaProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerConfig kafkaProducerConfig;

    @RequestMapping(value = "/{message}")
    public String index(@PathVariable String message) {

        kafkaProducerConfig.sendMessage(message);
        return "Hello World";
    }
}
