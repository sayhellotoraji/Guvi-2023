package spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerApplication.class, args);
	}

}

/*
 * 
 Steps to configure Eureka server
 1. Add @EnableEurekaServer annotation for Spring Server Application' s Driver class
 
 2. Add configuration in application.properties file
 
 
 */
