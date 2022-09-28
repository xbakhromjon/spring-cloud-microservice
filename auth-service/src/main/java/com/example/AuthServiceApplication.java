package com.example;


import com.example.properties.OpenApiProperties;
import com.example.properties.ServiceProperties;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@OpenAPIDefinition
@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties({OpenApiProperties.class, ServiceProperties.class})
@EnableJpaRepositories(basePackages = "com.example.repository")
public class AuthServiceApplication {
    public static void main(String[] args) {

    }
}