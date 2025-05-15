package com.example.demo.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORS implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 1. Applica CORS a tutte le rotte
        .allowedOrigins("http://127.0.0.1:5500") // 2. Solo questo dominio può fare richieste
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 3. Metodi HTTP permessi
        .allowedHeaders("*") // 4. Quali header può inviare il client
        .allowCredentials(false); // 5. Non permette cookie/authorization header
    }
}
