package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cotação de moedas para viagens\n");
		System.out.println("Bem-Vindo ao único lugar onde você pode fazer a conversão do seu suado dinheirinho para outras moedas mais importantes ;)");
		System.out.println("Primeiro informe quantos reais você tem: ");
		double quantReais = sc.nextDouble();
		System.out.println("Agora escolha para qual das moedas a seguir você quer ver a conversão dela.\n"
				+ "[ 1 ] Dólar\n"
				+ "[ 2 ] Marco Alemão\n"
				+ "[ 3 ] Libra Esterlina\n"
				+ "[ 4 ] Todas elas");
		int resp = sc.nextInt();
		double dolCot = quantReais/1.80;
		double maCot = quantReais/2;
		double lbCot = quantReais/1.57;
		if (resp == 1) {
			System.out.println("Fazendo a conversão de R$ "+quantReais+" para dólares, você terá um total de $ "+dolCot);
		}
		else if (resp == 2) {
			System.out.println("Fazendo a conversão de R$ "+quantReais+" para Marco Alemão, você terá um total de "+maCot+" Marcos Alemães");
		}
		else if (resp == 3) {
			System.out.println("Fazendo a conversão de R$ "+quantReais+" para Libras Esterlinas, você terá um total de "+lbCot+" Libras Esterlinas");
		} 
		else if (resp == 4) {
			System.out.println("R$ "+quantReais+" = $ "+(new DecimalFormat(".##").format(dolCot))+"\n"
					+"R$ "+quantReais+" = "+maCot+" Marcos Alemães\n"
				    +"R$ "+quantReais+" = "+lbCot+" Libras Esterlinas");
		}else {
			System.out.println("Opção inválida");
		}
		

	}

}
