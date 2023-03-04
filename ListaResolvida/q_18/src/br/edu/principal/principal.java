package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * 18.Pedro comprou um saco de raçao com peso em quilo. 
		 * Pedro possui dois gatos para os quais fornece a quantidade de ração em gramas.
		 * Faça um programa que receba o peso do saco de raçao e a quantidade de raçao fornecida
		 * para cada gato.
		 * Calcule e mostre quando restará de raçao no saco apos cinco dias.
		 */
		 Scanner sc = new Scanner(System.in);
			System.out.println("Digite o peso do saco: ");
			double peso_saco = sc.nextDouble();
			System.out.println("Digite quantas gramas o gato 1 come: ");
			double racao_gato1 = sc.nextDouble();
			System.out.println("Digite quantas gramas o gato 2 come: ");
			double racao_gato2 = sc.nextDouble();
			double div1 = racao_gato1 / 1000;
			double div2 = racao_gato2 / 1000;
			double total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
			System.out.println("Isso foi o que restou: " + total_final);
		
	}

}
