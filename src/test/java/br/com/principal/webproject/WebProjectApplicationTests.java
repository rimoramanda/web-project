package br.com.principal.webproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class WebProjectApplicationTests {

	private BigDecimal meuSalarioEstagio = new BigDecimal(1800.00);

	@Test
	void contextLoads() {
		System.out.println("Começando o Debug ==>");
		System.out.println("O salário do estágio é : " + meuSalarioEstagio);
		System.out.println("fim do debug");

	}

}
