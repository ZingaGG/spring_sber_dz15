package com.example.spring_sber_dz15;

import com.example.spring_sber_dz15.Repository.ProductRepository;
import com.example.spring_sber_dz15.Service.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSberDz15Application{

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringSberDz15Application.class, args);
		ProductRepository productService = context.getBean(ProductServiceImpl.class); // Берем из контекста бин сервиса, как показано на лекции

		System.out.println("All products:");
		productService.getAllProducts().forEach(System.out::println);

		System.out.println("\nProduct by ID 2:");
		System.out.println(productService.getProductById(2L));
	}
}
