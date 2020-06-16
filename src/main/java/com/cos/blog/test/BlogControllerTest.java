package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Spring 이 com.cos.blog 패키지 이하를 스캔하여 특정 어노테이션이 붙어있는 클래스 파일을 New해서 (IoC) 스프링 컨테이너에 관리해줌.
@RestController
public class BlogControllerTest {
	
	// http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
}
