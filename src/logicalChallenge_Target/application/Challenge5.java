package logicalChallenge_Target.application;

import java.util.Scanner;

public class Challenge5 {

	public static void main(String[] args) {

		/**
		 * Escreva um programa que inverta os caracteres de um string. 
		 * IMPORTANTE: 
		 * a)Essa string pode ser informada através de qualquer entrada de sua preferência
		 * ou pode ser previamente definida no código; 
		 * b) Evite usar funções prontas, como, por exemplo, reverse;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("INVERTENDO STRINGS");
		
		//Testes automátizados
		String test1 = "Jhone Rodrigues";
		printChallenge5(test1);
		String test2 = "Futuro estágiario na Target Sistemas";
		printChallenge5(test2);
		String test3 = "ERP";
		printChallenge5(test3);

		// Teste com usuário
		System.out.print("Escolha uma palavra para testar: ");
		String test4 = sc.nextLine();
		printChallenge5(test4);

		sc.close();
	}

	// Funcao logica para inverter qualquer String
	public static String reverseString(String st) {
		StringBuilder result = new StringBuilder();
		
		for (int i = st.length() - 1; i >= 0; i--) {
			result.append(st.charAt(i));
		}
		
		return result.toString().toLowerCase();
	}

	// Exibicao padronizada do resultado
	public static void printChallenge5(String st) {
		System.out.println("\nInvertendo a String \"" + st + "\"");
		System.out.println("R: " + reverseString(st)+"\n");
	}
}
