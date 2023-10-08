package dev.o9uz.springmustacheapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringMustaceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMustaceAppApplication.class, args);
    }

}
