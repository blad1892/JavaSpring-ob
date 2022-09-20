package com.example.JavaSpringob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaSpringObApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(JavaSpringObApplication.class, args);
        CocheInterface cocheInterface = context.getBean(CocheInterface.class);

        System.out.println("FIN!");
    }

}
