package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * Faça um progama que calcule e mostre a área de um losangulo.
		 * Sabe-se que: A = (diagonal maior * menor)/2
		 */
		Scanner sc = new Scanner(System.in);
		float A, diag_maior, diag_menor;
		System.out.println("Você quer calcular a área de um Losango? \nEntão esta é a calculadora perfeita!");
		System.out.println("-----------------------------------\nDigite a Diagonal Maior: ");
		diag_maior = sc.nextFloat();
		System.out.println("Digite a Diagnal Menor: ");
		diag_menor = sc.nextFloat();
		A = (diag_maior * diag_menor)/2;
		System.out.println("----------------------------------");
		System.out.println("Esse é o valor da área deste Losango: " + A);
	}

}
