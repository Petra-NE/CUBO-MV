package Atividade;

import java.util.Scanner;

//// Adicionar a classe �Salario� no seu pacote Contenha o m�todo principal Main 
//Leia o nome da pessoa, o valor do sal�rio atual e o percentual de reajuste. Ao final deve calcular e 
//apresentar o sal�rio novo aplicando o percentual do reajuste.

public class Salario {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Qual seu nome: ");
		String nome = s.next();
		System.out.println("Seu salario: ");
		Double salario = s.nextDouble();

		
		
		System.out.println("Qual ser� o percentual de reajuste: ");
		int porcentagem = s.nextInt();
		
		s.close();

		Double valorTotal = salario + (salario * porcentagem/100);

		System.out.println("Oi:" + nome + " Seu salario:  " + salario + " Percentual de reajuste " + porcentagem + 
		 " % " + " O salario reajustado R$ " + valorTotal);

	} 

}
