package br.edu.princiapal;
import java.util.Scanner;
public class Principal5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Esse programa ir� calcular o comprimento, a �rea e o volume de uma esfera dependendo do raio informado pleo usu�rio. (o raio ser� sempre em cent�metros)\n");
		System.out.println("Digite o valor do raio da esfera: ");
		double raio = sc.nextDouble();
		double pi = 3.14;
		double comprimento = 2*pi*raio;
		double area = pi * Math.pow(raio, 2);
		double volume = (4*pi*Math.pow(raio,3))/3;
		System.out.println("###########################");
		System.out.println("- O comprimento dessa esfera de raio "+raio+" ser� de "+comprimento+" cm");
		System.out.println("- A �rea dessa esfera de raio "+raio+" ser� de "+area+" cm�");
		System.out.println("- O volume dessa esfera de raio "+raio+" ser� de "+volume+" cm�");

	}

}
