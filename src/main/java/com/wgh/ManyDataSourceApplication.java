package com.wgh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class ManyDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyDataSourceApplication.class, args);
	}

}
