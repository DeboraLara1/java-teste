package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastro.Animal;
import cadastro.Cliente;

public class Procedimento {
	
	// array de clientes
	ArrayList<String> clientes = new ArrayList<String>();

	// scanner
	Scanner ler = new Scanner(System.in);

	void cadastraCliente() {

		// instancia classe Cliente
		// NomeClasse nomeClasse = new NomeClasse();
		Cliente cliente = new Cliente();

		// variaveis
		// Tipo nomeVariavel;
		String nomeCliente = ""; // variavel que recebe o nome do cliente
		String escolha; // recebe a escolha de SIM ou NAO

		// faça
		do {
			System.out.println("\nPor favor, digite o seu nome: ");
			nomeCliente = ler.nextLine();
			cliente.setNome(nomeCliente);

			System.out.println("\nPor favor, digite o seu endereço: ");
			cliente.setEndereço(ler.nextLine());

			System.out.println("\nPor favor, digite o seu numero de telefone: ");
			cliente.setContato(ler.nextLine());

			System.out.println("\nPor favor, digite o seu e-mail: ");
			cliente.setEmail(ler.nextLine());

			adicionaClienteAlista(nomeCliente);

			System.out.println("\nDeseja adicionar mais alguém à lista? Responda com SIM ou NAO");
			escolha = ler.nextLine().toUpperCase();

		} while (escolha.equals("SIM"));

		System.out.println("\nObrigado, volte sempre!");

		System.out.println("\n\n");

		exibir_clientes();
	}

	void cadastraAnimal() {
		System.out.println("estou no cadastro de animal");
	}

	private void adicionaClienteAlista(String nomeCliente) {
		// colocar nome do cliente na lista "clientes"
		clientes.add(nomeCliente);
	}

	void exibir_clientes() {
		System.out.println("Atualmente nossos clientes são: " + clientes);
	}
	
	void cadastroRestricao() {
		// ...
	}

	void statusServiço() {

	}
}
