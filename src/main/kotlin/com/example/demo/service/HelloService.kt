package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun say(name: String) : String {
        return name + " Hello!"
    }
}
