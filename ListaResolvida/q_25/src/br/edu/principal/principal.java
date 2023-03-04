package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo.
		 * Esse programa deve calcular e mostrar a quantidade de convites que devem ser vendidos para que pelo 
		 * menos o custo do espetáculo seja alcançado
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Custo do Espetáculo: ");
		int custo = sc.nextInt();
		System.out.println("Digite o Preço do Convite: ");
		int convite = sc.nextInt();
		int qtd = custo / convite;
		System.out.println("A quantidade total de convite a serem vendidos é de : " + qtd);
	}

}
