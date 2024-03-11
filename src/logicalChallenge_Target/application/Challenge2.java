package logicalChallenge_Target.application;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		
		/**
		 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
		 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
		 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
		 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
		 * avisando se o número informado pertence ou não a sequência.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("PROCURANDO NÚMEROS NA SEQUÊNCIA DE FIBONACCI");
		
		// Testes automátizados
		int test1 = 200;
		printChallenge2(test1);
		int test2 = 55;
		printChallenge2(test2);
		int test3 = 0;
		printChallenge2(test3);
		
		// Teste com usuário
		System.out.print("Escolha um número para testar: ");
		int test4 = sc.nextInt();
		printChallenge2(test4);
		
		sc.close();
	}
	
	public static String lookForFibonacci(int n) {
		if(n == 0) return "R: Pertence a sequência, é o 1º número.";
				
		int[] fibo = new int[] { 0, 1 };
		int index = 2;
		
		while (fibo[1] < n) {
			fibo[1] += fibo[0];
			fibo[0] = fibo[1] - fibo[0];
			index++;
		}
		
		return fibo[1] == n ? "R: Pertence a sequência, é o " + index + "º número." 
				: "R: Não pertence a sequência.";
	}
	
	public static void printChallenge2(int n){
		System.out.println("\nProcuramos o número " + n + ".");
		System.out.println(lookForFibonacci(n)+"\n");
	}
}
