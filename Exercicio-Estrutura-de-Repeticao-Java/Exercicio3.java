package ComandosDeRepetição;

import java.util.Scanner;

//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe seu nome? ");

		String nome = entrada.next();

		for (int i = 0; i < 10; i++) {

			System.out.println(nome);
			System.out.println(i);

		}entrada.close();

	}

}
