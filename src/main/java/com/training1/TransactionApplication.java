package com.training1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.training1")
//@EntityScan(basePackages = {"com.training1.model"})
public class TransactionApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(TransactionApplication.class, args);
	}

}
