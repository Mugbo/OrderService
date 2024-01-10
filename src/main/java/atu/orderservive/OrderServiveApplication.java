package atu.orderservive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderServiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiveApplication.class, args);
    }

}
