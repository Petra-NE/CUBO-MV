package Atividade;

import java.util.Scanner;

//ATIVIDADE 8 
//Incrementar na classe EstruturaDecisao um método que, utilizando a estrutura de decisão switch case receba a entrada um numero inteiro. Se o 
//valor for válido (entre 1 e 4), o programa deve exibir a mensagem "Você escolheu ...", caso contrário, deve apresentar a mensagem "Número inválido". 

public class EstruturaDecisaoSwitchCase {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um número entre 1 a 10");

		int numero = entrada.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Você escolheu: 1.");
			break;
		case 2:
			System.out.println("Você escolheu: 2.");
			break;
		case 3:
			System.out.println("Você escolheu: 3.");
			break;
		case 4:
			System.out.println("Você escolheu: 4.");
			break;
		default:
			System.out.println("O número escolhido é inválido!");

		}entrada.close();
	}

}
