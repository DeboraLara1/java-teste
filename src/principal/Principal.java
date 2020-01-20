package principal;

import java.util.Scanner;

import cadastro.Animal;

public class Principal {
	
	// metodo principal
	public static void main(String[] args) {

		// instancia da classe Procedimento
		Procedimento procedimento = new Procedimento();

		System.out.println("Olá, bem vido ao sistema pet vida!");
		System.out.println("1 - Vamos iniciar com o seu cadastro...\n");

		// cadastro de cliente
		procedimento.cadastraCliente();
		
		System.out.println("\n2 - Agora vamos realizar o cadastro do seu animal...");
		System.out.println("Vamosfazer o cadastro de seu animal!");
		procedimento.cadastraAnimal();
		
		// ...
	} 
}
