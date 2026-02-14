package sahe.com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
        System.out.println("""
            Status: RUNNING
            Port: 8080
            Eureka: http://localhost:8761
            Routes:
            /auth/**      → Auth Service
            /users/**     → User Service
            /products/**  → Product Service
            /inventory/** → Inventory Service
            /orders/**    → Order Service
            /payments/**  → Payment Service
        """);
    }
}
