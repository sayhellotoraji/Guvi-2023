package com.java.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.junit.model.Employee;

@SpringBootApplication
public class JUnitTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JUnitTestApplication.class, args);

	}

}

// Components: JUnit-
/*
 * Lombok dependency - Annotation for boiler platecode
 * 
 * Lombok working in eclipse - https://projectlombok.org/setup/eclipse
 * ----> Add dependency in pom.xml
 * ----> Add plugin in STS
 * ----> Dont restart, Close the project and reopen
 */


