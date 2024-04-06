package com.example.graphqlserver.controller;


import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class FirstQuery {

    @QueryMapping
    public String hello() {
        return "Welcome Raja";
    }
}
