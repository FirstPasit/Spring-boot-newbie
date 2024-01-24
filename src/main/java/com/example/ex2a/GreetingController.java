package com.example.ex2a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController{
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name" , defaultValue = "World" ) String name
            ,@RequestParam(value="department" , defaultValue = "Computer Science" ) String department ){
        return new Greeting(counter.incrementAndGet(),"Hello, " + name + " - " + department);
    }
}

