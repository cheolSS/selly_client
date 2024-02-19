package com.onycom.imqa.selly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SellyClientApplication {

    public static void main(String[] args) throws RuntimeException {
        SpringApplication.run(SellyClientApplication.class, args);
    }

}
