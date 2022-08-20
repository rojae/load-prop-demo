package com.example.demo;

import kr.rojae.prop.LoadPropExecution;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application extends LoadPropExecution {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
