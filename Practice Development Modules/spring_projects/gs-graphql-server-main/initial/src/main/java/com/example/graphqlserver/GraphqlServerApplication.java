package com.example.graphqlserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlServerApplication.class, args);
	}
}


/*

Produces Status code and message of Response
query{
	status
}
 */