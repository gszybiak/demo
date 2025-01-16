package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testHello() {
		String message = "Hello, Jenkins!";
		assertThat(message).isEqualTo("Hello, Jenkins!");
	}

}
