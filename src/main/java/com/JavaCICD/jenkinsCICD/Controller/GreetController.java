package com.JavaCICD.jenkinsCICD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello, Welocme CI/CD First Project.!";
    }
}
