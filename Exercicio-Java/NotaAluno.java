package Atividade;
import java.util.Scanner;
public class NotaAluno {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite a 1� nota: ");
		float nota1 = s.nextFloat();
		System.out.println("Digite a 2� nota: ");
		float nota2 = s.nextFloat();
		System.out.println("Digite a 3� nota: ");
		float nota3 = s.nextFloat();
		System.out.println("Digite a 4� nota: ");
		float nota4 = s.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.printf("Voc� est� aprovado! A sua m�dia foi de: \n %.2f", media);
		} else {System.out.printf("Infelizmente voc� foi reprovado, tente outra vez! A sua m�dia foi de: \n %.2f", media);}
		s.close();
	}

}

//int quantidade = 4;
//float soma = nota1 + nota2 + nota3 + nota4;
//float media = soma / quantidade;
