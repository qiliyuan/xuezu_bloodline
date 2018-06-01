package com.qly.xuezu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class App {

	public static void main(String[] args) {
		//gai
		System.out.println("Xuezu开始启动Spring boot");
		SpringApplication.run(App.class, args);
		System.out.println("Xuezu启动完毕");
	}
}
