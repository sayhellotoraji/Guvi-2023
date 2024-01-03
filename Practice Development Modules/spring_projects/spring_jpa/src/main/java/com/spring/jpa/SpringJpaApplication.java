package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);

	}

}

//*********************************************************************************/
// 				Response Entity Type
// Use Map Object in the ResponseEntity for easy conversion of Java Object to JSON

// ResponseEntity creation - 2 Approaches
// 1. Annotation
// 		@ResponseBody 
//		@ResponseStatus
// 2. Object using :  new ResponseEntity<>(body, headers, status codes);
// 		ResponseEntity consists of 3 optional parameters
// 		Body, Headers, Status Codes
//


//***********************************************************************************/
// 				Exception Handling
// @ExceptionHandler - For individual exception type
// @ControllerAdvice - For Global Exception Handling mechanism - Centralized

// Steps:
// 1. Create Custom Exceptions in exception package
// 2. Handle Exceptions in Controllers 
// 3. Create Exception Handler package for Exceptions Handlers
// 4. Add @Controller Advice for Global Exception Handler class 
