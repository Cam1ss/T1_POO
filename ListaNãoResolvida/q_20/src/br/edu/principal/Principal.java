package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Descubra o tamanho da sua escada\n");
		System.out.println("Digite o ângulo formado pela a escada com o chão: ");
		int angulo = sc.nextInt();
		System.out.println("Escolha a grandeza para calcular o tamanho da sua escada:\n"
				+ "[ 1 ] Centímetros\n"
				+ "[ 2 ] Metros\n"
				+ "[ 3 ] Quilômetros");
		int resp = sc.nextInt();
		System.out.println("Digite a distância que a escada está para a parede: ");
		double tamanho = sc.nextDouble();
		double radiano = (angulo*3.14)/180;
		double escada = tamanho/Math.cos(radiano);
		if (resp == 1) {
			System.out.println("O tamannho da escada será de "+(new DecimalFormat(".##").format(escada))+" cm");
		}
		else if (resp == 2) {
			System.out.println("O tamannho da escada será de "+(new DecimalFormat(".##").format(escada))+" m");
		}
		else if (resp == 3) {
			System.out.println("O tamannho da escada será de "+(new DecimalFormat(".##").format(escada))+" Km");
		}else {
			System.out.println("Opção inválida");
		}
		
		

	}

}
