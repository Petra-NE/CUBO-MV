package Atividade;

import java.util.Scanner;

//ATIVIDADE 10 
//Na classe EstruturaDecisaoAtividade , adicionar um m�todo que leia 2 n�meros inteiros. 
//Imprimir uma mensagem informando qual dos dois � o maior ou se s�o Iguais. 

public class EstruturaDecisaoAtividade10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um n�mero A de 1 a 20");

		float numA = entrada.nextFloat();

		System.out.println("Informe um n�mero B de 1 a 20");
		float numB = entrada.nextFloat();

		if (numA < numB) {

			System.out.printf("O n�mero B � maior");

		} else if (numA > numB) {

			System.out.printf("Os n�mero A � maior");

		}

		else if (numB == numA) {

			System.out.println("Os n�meros s�o iguais");

		}
		entrada.close();

	}
}
