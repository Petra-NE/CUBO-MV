package ComandosDeRepeti��o;

import java.util.Scanner;

//7) Leia a idade de 20 pessoas e exiba a m�dia das idades.

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Infome sua idade: ");

		int quantidade = 5;
		int idade;
		int soma = 0;

		int media = soma / quantidade;

		for (int i = 0; i < 5; i++) {

			idade = entrada.nextInt();
			soma = soma + idade;
			media = soma / quantidade;

		}
		entrada.close();

		System.out.println("A m�dias das idades � " + media);

	}

}
