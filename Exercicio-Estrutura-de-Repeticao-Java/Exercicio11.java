package ComandosDeRepetição;

import java.util.Scanner;

//11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8. 

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe 20* numeros: ");

		int numero;
		int quantidade = 0;

		for (int i = 0; i < 20; i++) {

			numero = entrada.nextInt();

			if (numero > 8) {

				quantidade = quantidade + 1;
			}

		}
		entrada.close();

		System.out.print(quantidade);

	}

}
