package ComandosDeRepetição;

import java.util.Scanner;

//9) Leia nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. 

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nome;
		String nomeMaisNova = "";
		int idade;
		int idadeMaisNova = 99;

		for (int i = 0; i < 2; i++) {

			System.out.println("Informe seu nome: ");
			nome = entrada.next();
			System.out.println("Informe seu idade: ");
			idade = entrada.nextInt();

			if (idade < idadeMaisNova) {

				idadeMaisNova = idade;
				nomeMaisNova = nome;

			}

		}
		entrada.close();

		System.out.print("A pessoa mais nova é " + nomeMaisNova + " tem " + idadeMaisNova +" anos.");

	}

}
