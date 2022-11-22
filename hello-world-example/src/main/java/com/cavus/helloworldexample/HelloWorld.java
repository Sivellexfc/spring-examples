package com.cavus.helloworldexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merhaba")
public class HelloWorld {

    @GetMapping
    public String Hello(){
        return "Merhabalar";
    }
}
