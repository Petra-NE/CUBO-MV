package ComandosDeRepeti��o;

import java.util.Scanner;

//10)   Crie   um   algoritmo   leia   um   n�mero   do   usu�rio   e   exiba   a   sua   tabuada   de multiplica��o.

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor maior que zero: ");
		int numero = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {

			if (numero > 0) {

				System.out.println(numero + " * " + i + " = " + numero * i);

			} else if (numero <= 0) {

				System.out.println("Numero inv�lido, numero menor ou igual a zero!");

			}

		}

		entrada.close();

	}

}
