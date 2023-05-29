package com.yusufu.awesomespring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @RequestMapping(value = "/")
    public String index() {

        return "Hello World";
    }
}
