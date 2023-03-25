package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guia do salário de um trabalhador ordinário.\n");
		System.out.println("Digite o valor do seu salário: ");
		double salMin = sc.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas: (somente valores inteiros)");
		int horas = sc.nextInt();
		System.out.println("Digite a quantidade de horas extras trabalhadas: (somente valores inteiros)");
		int horasExtras = sc.nextInt();
		double horaVal = 0.125 * salMin;
		double horaExVal = 0.25 * salMin;
		double salBruto = horas * horaVal;
		double quantHoraExVal = horasExtras * horaExVal;
		double salReceber = salBruto + quantHoraExVal;
		System.out.println("\n- O salário que você receberá será de R$ "+(new DecimalFormat(".##").format(salReceber)));

	}

}
