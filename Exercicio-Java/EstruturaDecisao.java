package Atividade;

import java.util.Scanner;

// ATIVIDADE 5 / ATIVIDADE 6 / ATIVIDADE 7  / ATIVIDADE 8 
//Incrementar na classe EstruturaDecisao um m�todo que utiliza a estrutura 
//composta II. Esse m�todo ter� o objetivo de classificar se o aluno foi aprovado, reprovado ou em recupera��o. 
//Considerando m�dia maior ou igual 7,0 para aprovado, menor que 4,0 para reprovado e caso contrario, em recupera��o.

public class EstruturaDecisao {

	public static void main(String[] args) {

		int quantidade = 2;

		Scanner s = new Scanner(System.in);
		System.out.println("Digite a 1� nota: ");
		float nota1 = s.nextFloat();
		System.out.println("Digite a 2� nota: ");
		float nota2 = s.nextFloat();

		float soma = nota1 + nota2;
		float media = soma / quantidade;

		if (media == 10) {

			System.out.printf("Parab�ns! Voc� tirou 10: \n %.2f", media);

		} else if (media >= 7) {

			System.out.printf("Parab�ns! Voc� foi APROVADO: \n %.2f", media);

		}

		else if (media >= 4 && media <= 6) {

			System.out.println("Voc� est� em RECUPERA��O");

		} else {
			System.out.printf("Aten��o!Voc� foi REPROVADO: \n %.2f", media);
		}
		s.close();

	}

}
