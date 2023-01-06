package com.example.shadi.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class mens {
    @GetMapping ("/mens")
    public String getData(){
        return " only boys hostel";
    }

}
