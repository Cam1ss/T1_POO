package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * 8. Façaum programa que receba o peso de uma pessoa em quilos, calcule e mostre esse
		 * peso em gramas
		 */
		Scanner sc = new Scanner(System.in);
		double peso_kg, peso_g;
		System.out.println("Digite seu Peso: ");
		peso_kg = sc.nextDouble();
		peso_g = peso_kg * 1000;
		System.out.println("------------------------------");
		System.out.println("Esse é o seu em Gramas: " + peso_g);
	}

}
