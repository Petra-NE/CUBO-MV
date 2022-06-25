package Atividade;
import java.util.Scanner;
public class NotaAluno {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite a 1º nota: ");
		float nota1 = s.nextFloat();
		System.out.println("Digite a 2º nota: ");
		float nota2 = s.nextFloat();
		System.out.println("Digite a 3º nota: ");
		float nota3 = s.nextFloat();
		System.out.println("Digite a 4º nota: ");
		float nota4 = s.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.printf("Você está aprovado! A sua média foi de: \n %.2f", media);
		} else {System.out.printf("Infelizmente você foi reprovado, tente outra vez! A sua média foi de: \n %.2f", media);}
		s.close();
	}

}

//int quantidade = 4;
//float soma = nota1 + nota2 + nota3 + nota4;
//float media = soma / quantidade;
