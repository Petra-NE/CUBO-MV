package Atividade;

import java.util.Scanner;

//ATIVIDADE 11 
//Na classe EstruturaDecisaoAtividade , adicionar um método que dada a idade de um nadador classifique o em uma das seguintes categorias: 
//infantil A = 5 7 anos infantil B = 8 10 anos juvenil A = 11 13 anos juvenil B = 14 17 anos adulto = 18 25 anos 
//Mostrar mensagem “idade fora da faixa etária” quando outro valor for informado. 

public class EstruturaDecisaoAtividade11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor informar a idade do nadador: ");

		int idade = entrada.nextInt();

		switch (idade) {
		case 5:
		case 6:
		case 7:
			
			System.out.println("infantil A = " + idade + " anos");
			break;
		case 8:
		case 9:
		case 10:
			
			System.out.println("infantil B = " + idade + " anos" );
			break;
		case 11:
		case 12:
		case 13:
			
			System.out.println("juvenil A = " + idade + " anos");
			break;
		case 14:
		case 15:
		case 16:
		case 17:
			
			System.out.println("juvenil B = " + idade + " anos");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
			
			System.out.println("adulto " + idade + " anos");
			break;
		default:
			System.out.println("Idade fora da faixa etária");

		}entrada.close();
	}

}
