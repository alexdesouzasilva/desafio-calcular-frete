package br.com.devsenior.desafio_calcula_frete;

import org.springframework.boot.SpringApplication;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import br.com.devsenior.desafio_calcula_frete.entity.Order;
import br.com.devsenior.desafio_calcula_frete.service.OrderService;

@SpringBootApplication
public class DesafioCalculaFreteApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioCalculaFreteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1038, 800.0, 10.0);
		double total = orderService.total(order);
		System.out.println("Pedido código: " + order.getCode());
		System.out.printf("Valor total: R$ %.2f\n", total);

	}

	

}
