package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura
          e a altura que o usuário deseja alcançar subindo a escada. Calcule e mostre quantos degraus
          o usuário deverá subir para atingir seu objetivo, sem se preocupar com a altura do usuário
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do degrau: ");
		double a_degrau, a_usuario, qtd_degraus;
		a_degrau = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		a_usuario = sc.nextDouble();
		qtd_degraus = a_usuario / a_degrau;
		System.out.println("Você deverá subir: "+qtd_degraus+ " degraus.");
	}

}
