package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	// 캐시는 Key에 문자열을 넣을 수도 있지만, 객체를 넣을 수도 있다. 객체를 넣을 시 .toString 함수가 자동 호출된다.
	@Cacheable(key = "#Payment", value = "hello")
	public void saveHello() {

	}
}
