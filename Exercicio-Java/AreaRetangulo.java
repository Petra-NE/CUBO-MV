package Atividade;

import java.util.Scanner;

// Adicionar a classe � AreaRetangulo � no seu pacote Contenha o m�todo principal Main 
//Deve ler dois valores informados pelo usu�rio, sendo a altura e largura de um ret�ngulo e ao final deve calcular e exibir a �rea ( area = altura * largura 

public class AreaRetangulo {

	public static void main(String[] args) {



		Scanner s = new Scanner(System.in);

		System.out.println("entre com os dados da altura: ");
		double altura = s.nextDouble();
		System.out.println("entre com os dados da largura: ");
		double largura = s.nextDouble();
		
		s.close();

		double area = altura * largura;

		System.out.println("O retangulo" + "tem valor de area = " + area);

	}

}
