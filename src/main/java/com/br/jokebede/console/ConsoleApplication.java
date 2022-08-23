package com.br.jokebede.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleApplication {

	public static void main(String[] args) throws IOException {
		// SpringApplication.run(ConsoleApplication.class, args);

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		/*
		 * System.out.println("===== [ Olá turma 2 Java IBM ] =======");
		 * 
		 * System.out.println("Digite o seu nome:");
		 * String nome = reader.readLine();
		 * 
		 * System.out.println("O nome digitado foi: " + nome);
		 */

		String[] nomes = new String[3];
		System.out.println("Digite três nomes: ");
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = reader.readLine();
		}
		System.out.println();
		System.out.println("Listando os nomes digitados: ");
		for (String n : nomes) {
			System.out.println(n);

		}
	}

}
