package br.edu.principal;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora da área de um triângulo (em metros).");
		System.out.println("Digite o valor da altura do triângulo: ");
		float alt = sc.nextFloat();
		System.out.println("Digite o valor da base do triângulo: ");
		float base = sc.nextFloat();
		float area = (base + alt)/2;
		System.out.println("O valor da área desse triângulo é de "+area+" metros quadrados.");

	}

}
