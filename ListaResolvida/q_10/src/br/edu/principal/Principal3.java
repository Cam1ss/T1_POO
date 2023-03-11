package br.edu.principal;
import java.util.Scanner;
public class Principal3 {

	public static void main(String[] args) {
		double area;
		double raio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo da área de um círculo (em metros).");
		System.out.println("Digite o valor do raio desse círculo: ");
		raio = sc.nextDouble();
		area = 3.1415 * Math.pow(raio, 2);
		System.out.println("A área desse círculo será de "+area+" metros quadrados.");

	}

}
