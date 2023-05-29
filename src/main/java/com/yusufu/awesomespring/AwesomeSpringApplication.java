package com.yusufu.awesomespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AwesomeSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwesomeSpringApplication.class, args);
    }

}
