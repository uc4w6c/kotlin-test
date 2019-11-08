package com.example.demo

import com.example.demo.service.HelloService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

	@Test
	fun TaroHello() {
		val helloService = HelloService();
		val sayMessage = helloService.say("Taro")
		Assertions.assertEquals("Taro Hello!", sayMessage)
	}
}
