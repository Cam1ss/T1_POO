package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Descubra o tamanho da sua escada\n");
		System.out.println("Digite o �ngulo formado pela a escada com o ch�o: ");
		int angulo = sc.nextInt();
		System.out.println("Escolha a grandeza para calcular o tamanho da sua escada:\n"
				+ "[ 1 ] Cent�metros\n"
				+ "[ 2 ] Metros\n"
				+ "[ 3 ] Quil�metros");
		int resp = sc.nextInt();
		System.out.println("Digite a dist�ncia que a escada est� para a parede: ");
		double tamanho = sc.nextDouble();
		double radiano = (angulo*3.14)/180;
		double escada = tamanho/Math.cos(radiano);
		if (resp == 1) {
			System.out.println("O tamannho da escada ser� de "+(new DecimalFormat(".##").format(escada))+" cm");
		}
		else if (resp == 2) {
			System.out.println("O tamannho da escada ser� de "+(new DecimalFormat(".##").format(escada))+" m");
		}
		else if (resp == 3) {
			System.out.println("O tamannho da escada ser� de "+(new DecimalFormat(".##").format(escada))+" Km");
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		

	}

}
