package com.example.Docker.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/gg")
    public String teste(){
        return "!!! MIAMI HEAT !";
    }

}
