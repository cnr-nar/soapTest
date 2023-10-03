package com.demo.hello.wsdl;

import com.demo.hello.wsdl.service.MessageProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("twitter message sending ");
	}

}
