package com.example.ejercicios.ejercicio_seccion_1_2_3;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
