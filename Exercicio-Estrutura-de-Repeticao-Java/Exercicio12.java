package ComandosDeRepetição;

import java.util.Scanner;

//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares 

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe 20* numeros: ");

		int numero;
		int quantidade = 0;

		for (int i = 0; i < 5; i++) {

			numero = entrada.nextInt();

			if (numero % 2 == 0) {

				quantidade = quantidade + 1;

			}

		}entrada.close();
		System.out.println(quantidade);

	}

}
