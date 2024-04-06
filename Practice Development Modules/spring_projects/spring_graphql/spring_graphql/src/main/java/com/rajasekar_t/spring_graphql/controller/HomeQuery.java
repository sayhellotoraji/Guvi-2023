package com.rajasekar_t.spring_graphql.controller;

import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeQuery {
    // Check the working of GraphQL


    // 1. Query to send request

    @SchemaMapping
    public String step1() {
        return "Welcome Rajasekar T";
    }
}
