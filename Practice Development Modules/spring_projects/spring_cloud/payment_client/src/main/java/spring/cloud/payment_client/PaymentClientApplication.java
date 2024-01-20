package spring.cloud.payment_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentClientApplication.class, args);
	}

}

/*

Steps to configure Eureka Payment Client

1. Add @EnableDiscoveryClient annotation for Spring Server Application' s Driver class

2. Add configuration in application.properties file


*/