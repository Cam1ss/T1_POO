package br.edu.principal;
import java.util.Scanner;
public class Principal2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		double r1 = Math.pow(num1, num2);
		double r2 = Math.pow(num2, num1);
		System.out.println("O primeiro número elevado ao segundo é igual a: "+r1+"\nE o segundo número elevado ao primeiro é igual a: "+r2);

	}

}
