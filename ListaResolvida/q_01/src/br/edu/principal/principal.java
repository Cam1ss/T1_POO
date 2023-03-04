package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/**
		 * 1. Faça um programa que receba quatro numeros inteiros, calcule e mostre a soma desses numeros. 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua n1: ");
		int n1 = sc.nextInt();
		System.out.println("Digite sua n2: ");
	    int n2 = sc.nextInt();
	    System.out.println("Digite sua n3: ");
	    int n3 = sc.nextInt();
	    System.out.println("Digite sua n4: ");
	    int n4 = sc.nextInt();
	    int soma = n1 + n2 + n3 + n4;
	    System.out.println("A soma desses 4 números são: "+ soma);
		
	}

}
