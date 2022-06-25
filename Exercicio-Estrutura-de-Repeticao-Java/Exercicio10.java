package ComandosDeRepetição;

import java.util.Scanner;

//10)   Crie   um   algoritmo   leia   um   número   do   usuário   e   exiba   a   sua   tabuada   de multiplicação.

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor maior que zero: ");
		int numero = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {

			if (numero > 0) {

				System.out.println(numero + " * " + i + " = " + numero * i);

			} else if (numero <= 0) {

				System.out.println("Numero inválido, numero menor ou igual a zero!");

			}

		}

		entrada.close();

	}

}
