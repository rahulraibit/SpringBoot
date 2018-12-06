package io.javasprint.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan({"io.javasprint.hello", "controller"})
public class CourseAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CourseAPI.class, args);

	}

}
