package ComandosDeRepetição;

import java.util.Scanner;

//6) Leia a idade de 20 pessoas e exiba a soma das idades. 

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a sua idade ");

		int idade;
		int soma = 0;

		for (int i = 0; i < 5; i++) {

			idade = entrada.nextInt();
			soma = soma + idade;

		}entrada.close();

		System.out.println(soma);

	}

}
