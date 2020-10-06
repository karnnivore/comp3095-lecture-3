package ca.gbc.lecture3;

import ca.gbc.lecture3.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Lecture3Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Lecture3Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}


}
