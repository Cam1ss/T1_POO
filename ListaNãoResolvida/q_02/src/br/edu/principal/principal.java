package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * 2. Faça um programa que receba tres numeros, calcule e mostre a multiplicaçao desses numeros.
		 */
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n1: ");
		int n1 = sc.nextInt();
		System.out.println("Digite um n2: ");
		int n2 = sc.nextInt();
		System.out.println("Digite um n3: ");
		int n3 = sc.nextInt();
		int mult = n1 * n2 * n3;
		System.out.println("Essa é a multiplicação desses 3 números: " + mult);
	}

}
