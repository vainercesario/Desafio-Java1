package com.vainercesario.desafio1.desafio1;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vainercesario.desafio1.desafio1.entities.Order;
import com.vainercesario.desafio1.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pedido1 = orderService.total(new Order(1034, 150.0, 20.0));
		System.out.println(pedido1);

		var pedido2 = orderService.total(new Order(2282, 800.0, 10.0));
		System.out.println(pedido2);

		var pedido3 = orderService.total(new Order(1309, 95.90, 0.0));
		System.out.println(pedido3);
	}
}
