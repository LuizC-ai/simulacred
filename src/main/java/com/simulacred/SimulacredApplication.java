package com.simulacred;

import com.simulacred.domain.entities.Cliente;
import com.simulacred.domain.repositories.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class SimulacredApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulacredApplication.class, args);
	}

	@Bean
	CommandLineRunner loadData(ClienteRepository clienteRepository) {
		return args -> {
			Cliente cliente = new Cliente(
					null,
					"João Silva",
					"12345678900",
					LocalDate.of(1990, 5, 15),
					new BigDecimal("5000"),
					750
			);

			clienteRepository.save(cliente);
			System.out.println("Cliente salvo com sucesso: " + clienteRepository.findByCpf("12345678900"));
		};
	}

}
