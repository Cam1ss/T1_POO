package br.edu.princiapl;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá trabalhador, o seu chefe acaba de te dar um aumento de 25% no seu sálario, que tal deescobrir quanto você ganha agora?");
		System.out.println("Digite o seu salário atual: ");
		float sal = sc.nextFloat();
		float novoSal = (float) (sal + (sal * 0.25));
		System.out.println("O seu novo sálario será de "+novoSal);

	}

}
