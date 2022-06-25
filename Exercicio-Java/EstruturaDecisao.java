package Atividade;

import java.util.Scanner;

// ATIVIDADE 5 / ATIVIDADE 6 / ATIVIDADE 7  / ATIVIDADE 8 
//Incrementar na classe EstruturaDecisao um método que utiliza a estrutura 
//composta II. Esse método terá o objetivo de classificar se o aluno foi aprovado, reprovado ou em recuperação. 
//Considerando média maior ou igual 7,0 para aprovado, menor que 4,0 para reprovado e caso contrario, em recuperação.

public class EstruturaDecisao {

	public static void main(String[] args) {

		int quantidade = 2;

		Scanner s = new Scanner(System.in);
		System.out.println("Digite a 1º nota: ");
		float nota1 = s.nextFloat();
		System.out.println("Digite a 2º nota: ");
		float nota2 = s.nextFloat();

		float soma = nota1 + nota2;
		float media = soma / quantidade;

		if (media == 10) {

			System.out.printf("Parabéns! Você tirou 10: \n %.2f", media);

		} else if (media >= 7) {

			System.out.printf("Parabéns! Você foi APROVADO: \n %.2f", media);

		}

		else if (media >= 4 && media <= 6) {

			System.out.println("Você está em RECUPERAÇÃO");

		} else {
			System.out.printf("Atenção!Você foi REPROVADO: \n %.2f", media);
		}
		s.close();

	}

}
