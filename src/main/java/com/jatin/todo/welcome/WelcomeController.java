package com.jatin.todo.welcome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {
	
	@GetMapping("/")
//	@PreAuthorize("hasAuthority('SCOPE_todoread')")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping(path = "/basicauth")
	public String basicAuthCheck() {
		return "Success"; 
	}

	@GetMapping(path = "/hello-world")
	public String helloWorld1() {
		return "Hello World v2"; 
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean v1"); 
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name)); 
	}	

}
