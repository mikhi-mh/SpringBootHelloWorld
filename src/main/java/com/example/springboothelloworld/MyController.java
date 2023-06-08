package com.example.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MyController {

    @GetMapping("getMsg/{name}")
    public String getMsg(@PathVariable String name){
        return "नमस्कार " + name + " how are you";
    }

}
