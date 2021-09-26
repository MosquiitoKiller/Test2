package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application launch class
 */
@SpringBootApplication
public class DemoApplication {
    /**
     * Application launch method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//http://localhost:8080/home/St/create?name=TeSt&last=test&mid=tEsT
}
