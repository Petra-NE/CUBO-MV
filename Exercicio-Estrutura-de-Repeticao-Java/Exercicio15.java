package ComandosDeRepeti��o;

import java.util.Scanner;

//15)  Escreva  um  algoritmo  que  leia  uma  sequ�ncia  de  n�meros  do  usu�rio  e  realize  a soma desses n�meros. 
//Encerre a execu��o quando um n�mero negativo for digitado.

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int soma = 0;

		System.out.println("Entre com numeros:");

		numero = entrada.nextInt();

		while (numero > 0) {

			soma = soma + numero;

			System.out.println("Entre com n�mero");
			numero = entrada.nextInt();

		}

		System.out.println("Valor da soma dos n�meros:" + soma);

		entrada.close();
	}

}
