package com.github.xenteros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agurgul on 12.06.2017.
 */
@RestController
@SpringBootApplication
public class Application {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
