package ComandosDeRepetição;

import java.util.Scanner;

//4)  Leia o nome um número do usuário um número N  e  escreva o nome dele na tela N vezes. 

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 1;

		System.out.println("Em quantas vezes você quer que apareça? ");
		int num = sc.nextInt();

		System.out.println("Qual seu nome : ");
		String nome = sc.next();

		while (contador <= num) {

			contador = contador + 1;
			
			System.out.println(nome);

		}

		sc.close();

	}

}
