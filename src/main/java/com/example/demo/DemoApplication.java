package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

//@RestController

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@GetMapping
	public String hello(){
		return "Hello World";
	}
	//http://localhost:8080/
	@GetMapping
	public List<String> hello2(){
		return List.of("Hello", "World");
	}*/

	/*@GetMapping
	public List<Student> hello3(){
		return List.of(new Student(
				1L,"Maria",
				"maria@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
		));
	}*/
}
