package ComandosDeRepeti��o;

import java.util.Scanner;

//13) Fa�a um algoritmo que leia 20 n�meros e, ao final, escreva quantos est�o entre 0 e 100. 

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 20* numeros de 0 a 1000: ");

		int numero;
		int quantidade = 0;

		for (int i = 0; i < 5; i++) {

			numero = entrada.nextInt();

			if (numero >= 0 && numero <= 100) {

				quantidade = quantidade + 1;

			}

		}entrada.close();
		
		System.out.println("Est�o entre 0 e 100 = " + quantidade);
		
	}

}
