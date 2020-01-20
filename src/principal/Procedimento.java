package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastro.Animal;
import cadastro.Cliente;

public class Procedimento {
	
	// array de clientes
	ArrayList<String> clientes = new ArrayList<String>();
	
	// array de Pet
		ArrayList<String> animais = new ArrayList<String>();

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

			adicionaAlista("clientes", nomeCliente);

			System.out.println("\nDeseja adicionar mais alguém à lista? Responda com SIM ou NAO");
			escolha = ler.nextLine().toUpperCase();

		} 
		while (escolha.equals("SIM"));

		System.out.println("\nObrigado, volte sempre!");

		System.out.println("\n\n");

		exibir("clientes");
	}

	void cadastraAnimal() {
		
	// instancia classe Cliente
			// NomeClasse nomeClasse = new NomeClasse();
			Animal animal = new Animal();

			// variaveis
			// Tipo nomeVariavel;
			String raça;
			String escolha; // recebe a escolha de SIM ou NAO

			// faça
			do {
				System.out.println("\nPor favor, digite o raça de seu animal: ");
				raça = ler.nextLine();
				animal.setRaça(raça);
				
				System.out.println("\nQual é a sua cor: ");
				animal.setCor(ler.nextLine());
				
				System.out.println("\nQual é o seu peso: ");
				animal.setPeso(Double.valueOf(ler.nextLine()));
				
				System.out.println("\nQual é a seu tamanho: ");
				animal.setTamanho(ler.nextLine());
				
				System.out.println("\nQual é a sua idade: ");
				animal.setIdade(ler.nextInt());
				
				adicionaAlista("animais", raça);
				
				System.out.println("\nDeseja adicionar mais alguém à lista? Responda com SIM ou NAO");
				escolha = ler.nextLine().toUpperCase();

				
			}while (escolha.equals("SIM"));

			System.out.println("\nObrigado, volte sempre!");

			System.out.println("\n\n");

			exibir("animais");
		}

				

	private void adicionaAlista(String lista ,String nome) {
		if (lista.equals("animais")) {
			animais.add(nome);
		} else if (lista.equals("clientes")){
		// colocar nome do cliente na lista "clientes"
		clientes.add(nome);
		} else {
			System.out.println("Não foi possivel adicionar o " + lista + " à lista, pois essa lista não existe!");
		}
	}

	void exibir(String lista) {
		if (lista.equals("animais")) {
		System.out.println("Atualmente nossos clientes Pets são: " + animais);
		} else if (lista.equals("clientes")) {
			System.out.println("Atualmente nossos clientes são: " + clientes);
		} else {
			System.out.println("Não foi possivel exibir uma lista de nome " + lista + " pois essa lista não existe!");
		}
	}
	
	void cadastroRestricao() {
		// ...
	}

	void statusServiço() {

	}
}
