package ComandosDeRepeti��o;

import java.util.Scanner;

//14) Fa�a um algoritmo que leia 20 n�meros e, ao final, escreva quantos est�o entre 0 e 100, 
//quantos est�o entre 101 e 200 e quantos s�o maiores de 200.

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

		System.out.println("Est�o entre 0 e 100 = " + quantidade);
		System.out.println("Est�o entre 101 e 200 = " + quantidade1);
		System.out.println("Maiores de 200 = " + quantidade2);

	}

}
