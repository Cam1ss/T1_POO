package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cota��o de moedas para viagens\n");
		System.out.println("Bem-Vindo ao �nico lugar onde voc� pode fazer a convers�o do seu suado dinheirinho para outras moedas mais importantes ;)");
		System.out.println("Primeiro informe quantos reais voc� tem: ");
		double quantReais = sc.nextDouble();
		System.out.println("Agora escolha para qual das moedas a seguir voc� quer ver a convers�o dela.\n"
				+ "[ 1 ] D�lar\n"
				+ "[ 2 ] Marco Alem�o\n"
				+ "[ 3 ] Libra Esterlina\n"
				+ "[ 4 ] Todas elas");
		int resp = sc.nextInt();
		double dolCot = quantReais/1.80;
		double maCot = quantReais/2;
		double lbCot = quantReais/1.57;
		if (resp == 1) {
			System.out.println("Fazendo a convers�o de R$ "+quantReais+" para d�lares, voc� ter� um total de $ "+dolCot);
		}
		else if (resp == 2) {
			System.out.println("Fazendo a convers�o de R$ "+quantReais+" para Marco Alem�o, voc� ter� um total de "+maCot+" Marcos Alem�es");
		}
		else if (resp == 3) {
			System.out.println("Fazendo a convers�o de R$ "+quantReais+" para Libras Esterlinas, voc� ter� um total de "+lbCot+" Libras Esterlinas");
		} 
		else if (resp == 4) {
			System.out.println("R$ "+quantReais+" = $ "+(new DecimalFormat(".##").format(dolCot))+"\n"
					+"R$ "+quantReais+" = "+maCot+" Marcos Alem�es\n"
				    +"R$ "+quantReais+" = "+lbCot+" Libras Esterlinas");
		}else {
			System.out.println("Op��o inv�lida");
		}
		

	}

}
