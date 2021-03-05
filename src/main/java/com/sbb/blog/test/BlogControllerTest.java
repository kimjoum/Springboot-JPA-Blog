package com.sbb.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//스프링이 com.sbb.blog 이하를 스캔해서 특정 어노테이션이 붙어있는 클래스 파일들을 new 해서 (IoC) 스프링 컨테이너에 관리
public class BlogControllerTest {

	@GetMapping("/test/hello")
	// http://localhost:8080/test/hello
	public String hello() {
		return "<h1>Spring Boot</h1>";
	}
}
