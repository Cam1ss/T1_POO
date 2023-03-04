package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * Sabe-se que:
         * 1 pé = 12 polegadas
         * 1 jarda = 3 pés
         * 1 milha = 1.760 jardas
         * Faça um programa que receba uma medida em pés, faça as conversões a seguir e
         * mostre os resultados.
         *a) polegadas;
         *b) jardas;
         *c) milhas.
		 */
		Scanner sc = new Scanner(System.in);
		float pes, polegadas, jardas, milhas;
		System.out.println("Digite seu número em pés: ");
		pes = sc.nextFloat();
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		System.out.println("a)Em Polegadas:\n" + polegadas + "\nb)Em Jardas:\n" + jardas + "\nc)Em milhas:\n" + milhas);
				
	}

}
