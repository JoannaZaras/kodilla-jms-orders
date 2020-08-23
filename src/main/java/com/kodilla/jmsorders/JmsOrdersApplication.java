package com.kodilla.jmsorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsOrdersApplication.class, args);
	}

}
