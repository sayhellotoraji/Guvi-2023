package com.rajasekar_t.spring_graphql.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeQuery {
    // Check the working of GraphQL


    // 1. Query to send request
    /*
    query{
        step1
    }
    */
    @QueryMapping
    public String step1() {
        return "Welcome Rajasekar T";
    }

    // 2. Query to send request with parameters

//    @QueryMapping
//    public String step2(Integer userID){
//        return "User Id: " + userID;
//    }
}
