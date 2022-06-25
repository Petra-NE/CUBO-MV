package ComandosDeRepetição;

import java.util.Scanner;

//8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a sua idade: ");

		int idade;
		int quantidade = 0;

		for (int i = 0; i < 5; i++) {

			idade = entrada.nextInt();

			if (idade >= 18) {

				quantidade = quantidade + 1;

			}

		}
		entrada.close();
		System.out.println(quantidade);

	}

}
