package com.example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
@RequiredArgsConstructor
@EnableEurekaClient
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }


    private final AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()

                .route("ms1", r -> r.path("/api/ms1/**")
                        .uri("lb://ms1"))

                .route("ms2", r -> r.path("/api/ms2/**")
                        .uri("lb://ms2"))
                .build();
    }

    @Configuration
    public static class CorsConfiguration extends org.springframework.web.cors.CorsConfiguration {
        @Bean
        public CorsWebFilter corsFilter() {
            org.springframework.web.cors.CorsConfiguration corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
            corsConfiguration.setAllowCredentials(true);
            corsConfiguration.addAllowedOrigin("http://localhost:3000/");
//            corsConfiguration.addAllowedOrigin("http://www.new.d-doc.uz");
            corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "PATCH"));
            corsConfiguration.addAllowedHeader("*");
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration("/**", corsConfiguration);
            return new CorsWebFilter(source);
        }
    }
}




