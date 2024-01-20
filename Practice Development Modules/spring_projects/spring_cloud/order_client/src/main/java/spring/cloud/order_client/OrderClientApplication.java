package spring.cloud.order_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderClientApplication.class, args);
	}
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}

/*
 
 Steps to configure Eureka Order Client
 
 1. Add @EnableDiscoveryClient annotation for Spring Server Application' s Driver class
 
 2. Add configuration in application.properties file
 
 3. Create RestTemplate as a Bean - Deprecated
 	Perform Http Requests for Rest Services between Modules/ Components
 
 
 */