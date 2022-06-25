package ComandosDeRepetição;

import java.util.Scanner;

//5)  Escreva  um  algoritmo  que  leia  10  números  do  usuário  e  calcule  a  soma  desses números. 

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int soma = 0;

		System.out.println("Digite 10 numeros");

		for (int i = 0; i < 5; i++) {

			numero = entrada.nextInt();
			soma = soma + numero;

		}
		entrada.close();

		System.out.println("A soma total dos numeros " + soma);

	}

}
