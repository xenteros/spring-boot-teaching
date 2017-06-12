package com.github.xenteros.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by agurgul on 12.06.2017.
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @RequestMapping(method = GET, value = "/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
