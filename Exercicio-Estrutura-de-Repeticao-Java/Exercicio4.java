package ComandosDeRepeti��o;

import java.util.Scanner;

//4)  Leia o nome um n�mero do usu�rio um n�mero N  e  escreva o nome dele na tela N vezes. 

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 1;

		System.out.println("Em quantas vezes voc� quer que apare�a? ");
		int num = sc.nextInt();

		System.out.println("Qual seu nome : ");
		String nome = sc.next();

		while (contador <= num) {

			contador = contador + 1;
			
			System.out.println(nome);

		}

		sc.close();

	}

}
