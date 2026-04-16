package proj_calc;

import java.util.Scanner;

public class VeryCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
		
		System.out.println("=== CALCULADORA VeryCalc EM JAVA ===");
		System.out.println("======== ESCOLHA UMA OPÇÃO =========");
		System.out.println("---------> 1 SOMA");
		System.out.println("---------> 2 SUBTRAÇÃO");
		System.out.println("---------> 3 MULTIPLICAÇÃO");
		System.out.println("---------> 4 DIVISÃO");
		System.out.println("---------> 0 SAIR");
		opcao = sc.nextInt();
		
		if (opcao >= 1 && opcao <= 4) {
			System.out.println("=== DIGITE O PRIMEIRO NÚMERO ===");
			int n1 = sc.nextInt();
			System.out.println("=== DIGITE O SEGUNDO NÚMERO ====");
			int n2 = sc.nextInt();
			int resultado = 0;
			
			switch (opcao) {
			case 1: 
				resultado = n1 + n2;
				break;
			case 2:
				resultado = n1 - n2;
				break;
			case 3:
				resultado = n1 * n2;
				break;
			case 4:
				if (n2 != 0) {
					resultado = n1 / n2;
				} else {
					System.out.println("Erro! Divisão por zero!");
				}
				break;
			
			}
			System.out.println("O RESULTADO É: " + resultado);
			
		} else if (opcao != 0) {
			System.out.println("=== OPÇÃO INVÁLIDA! ===");
			
		}
		
		} while (opcao != 0);
		System.out.println("=== VeryCalc ENCERRADO ===");
		sc.close();

	}

}
