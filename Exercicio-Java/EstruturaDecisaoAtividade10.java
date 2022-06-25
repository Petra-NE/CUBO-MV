package Atividade;

import java.util.Scanner;

//ATIVIDADE 10 
//Na classe EstruturaDecisaoAtividade , adicionar um método que leia 2 números inteiros. 
//Imprimir uma mensagem informando qual dos dois é o maior ou se são Iguais. 

public class EstruturaDecisaoAtividade10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número A de 1 a 20");

		float numA = entrada.nextFloat();

		System.out.println("Informe um número B de 1 a 20");
		float numB = entrada.nextFloat();

		if (numA < numB) {

			System.out.printf("O número B é maior");

		} else if (numA > numB) {

			System.out.printf("Os número A é maior");

		}

		else if (numB == numA) {

			System.out.println("Os números são iguais");

		}
		entrada.close();

	}
}
