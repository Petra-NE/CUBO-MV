package ComandosDeRepetição;

import java.util.Scanner;

//15)  Escreva  um  algoritmo  que  leia  uma  sequência  de  números  do  usuário  e  realize  a soma desses números. 
//Encerre a execução quando um número negativo for digitado.

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int soma = 0;

		System.out.println("Entre com numeros:");

		numero = entrada.nextInt();

		while (numero > 0) {

			soma = soma + numero;

			System.out.println("Entre com número");
			numero = entrada.nextInt();

		}

		System.out.println("Valor da soma dos números:" + soma);

		entrada.close();
	}

}
