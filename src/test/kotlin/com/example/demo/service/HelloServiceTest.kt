package com.example.demo.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloServiceTest

@Test
fun TaroHello() {
    val helloService = HelloService();
    val sayMessage = helloService.say("Taro")
    // あえてテストに失敗させる
    Assertions.assertEquals("Taro Hello!!", sayMessage)
}
