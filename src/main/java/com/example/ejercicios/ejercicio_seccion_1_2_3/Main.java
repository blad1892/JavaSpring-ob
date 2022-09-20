package com.example.ejercicios.ejercicio_seccion_1_2_3;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo) context.getBean("saludo");
        UserService userService=(UserService) context.getBean("userServe");

        userService.notificationService.ImpSaludo();
        System.out.println("Spring: " + saludo.imprimirSaludo());
    }
}
