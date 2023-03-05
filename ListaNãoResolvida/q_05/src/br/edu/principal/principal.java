package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		/*
		 * Façaum programa que receba o preço de um produto, calcule e mostre o novo preço,
         *sabendo-se que este sofreu um desconto de 10%.
		 */
		Scanner sc = new Scanner(System.in);
		float p_produto, desconto;
		int np_produto;
		System.out.println("Digite o Preço do Produto: ");
		p_produto = sc.nextFloat();
		desconto = (p_produto * 10)/100;
		np_produto = (int) (p_produto - desconto);
		System.out.println("-----------------------------");
		System.out.println("-Preço Original: \n R$" + p_produto + "\n-Com o desconto de 10%: \n R$" + np_produto);
	}

}
