package ComandosDeRepetição;

import java.util.Scanner;

//14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, 
//quantos estão entre 101 e 200 e quantos são maiores de 200.

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 20* numeros de 0 a 1000: ");

		int numero;
		int quantidade = 0;
		int quantidade1 = 0;
		int quantidade2 = 0;

		for (int i = 0; i < 5; i++) {

			numero = entrada.nextInt();

			if (numero >= 0 && numero <= 100) {

				quantidade = quantidade + 1;

			} else if (numero >= 101 && numero <= 200) {

				quantidade1 = quantidade1 + 1;

			} else {

				quantidade2 = quantidade2 + 1;

			}

		}
		entrada.close();

		System.out.println("Estão entre 0 e 100 = " + quantidade);
		System.out.println("Estão entre 101 e 200 = " + quantidade1);
		System.out.println("Maiores de 200 = " + quantidade2);

	}

}
