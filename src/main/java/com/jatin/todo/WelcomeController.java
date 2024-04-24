package com.jatin.todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
//	@PreAuthorize("hasAuthority('SCOPE_todoread')")
	public String helloWorld() {
		return "hello world";
	}

}
