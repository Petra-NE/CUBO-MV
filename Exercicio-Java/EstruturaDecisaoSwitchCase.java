package Atividade;

import java.util.Scanner;

//ATIVIDADE 8 
//Incrementar na classe EstruturaDecisao um m�todo que, utilizando a estrutura de decis�o switch case receba a entrada um numero inteiro. Se o 
//valor for v�lido (entre 1 e 4), o programa deve exibir a mensagem "Voc� escolheu ...", caso contr�rio, deve apresentar a mensagem "N�mero inv�lido". 

public class EstruturaDecisaoSwitchCase {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um n�mero entre 1 a 10");

		int numero = entrada.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Voc� escolheu: 1.");
			break;
		case 2:
			System.out.println("Voc� escolheu: 2.");
			break;
		case 3:
			System.out.println("Voc� escolheu: 3.");
			break;
		case 4:
			System.out.println("Voc� escolheu: 4.");
			break;
		default:
			System.out.println("O n�mero escolhido � inv�lido!");

		}entrada.close();
	}

}
