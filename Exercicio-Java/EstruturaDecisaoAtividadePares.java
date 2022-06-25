package Atividade;

import java.util.Scanner;

//ATIVIDADE 9 
//Na classe EstruturaDecisaoAtividade , adicionar um método que receba 
//um numero inteiro e verifique se esse numero é par ou impar. 
//Para verificar se o número é par, utilizar a fórmula: 
//(num % 2 ==0). 

public class EstruturaDecisaoAtividadePares {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um número entre 1 a 10");

		int numero = entrada.nextInt();

		switch (numero%2) {
		case 0:
			System.out.printf("Numero par \n", numero);

			break;
		case 1:
			System.out.printf("Numero impar \n", numero);
			break;

		}entrada.close();
	}

}
