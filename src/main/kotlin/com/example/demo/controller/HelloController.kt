package com.example.demo.controller

import com.example.demo.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class HelloController(private val helloService: HelloService) {
    @GetMapping("/hello")
    fun hello(): String {
        return helloService.say("Taro")
    }
}
