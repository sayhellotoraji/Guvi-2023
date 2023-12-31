package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.server.reactive.ServletHttpHandlerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@EnableWebMvc
public class SpringApplicationHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationHibernateApplication.class, args);
	}

}
