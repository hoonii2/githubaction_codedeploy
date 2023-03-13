package com.example.githubaction.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerStatusController {

    @GetMapping("/status")
    public String getStatus(){
        return "running!";
    }
}
