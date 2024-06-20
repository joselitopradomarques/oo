package aula02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		double a = entrada.nextDouble();
		System.out.print("Digite outro número inteiro: ");
		double b = entrada.nextDouble();
		entrada.close();
		
		double matrix_1[] = {a+b, a-b, a*b, a/b, Math.pow(a, b)};
		String matrix_2[] = {"soma", "subtracao", "multiplicacao", "divisao", "potenciacao"};

		int i = 0;
		
		for (i=0; i<5; i++)
			System.out.println("O resultado da operacao de " + matrix_2[i] + " eh " + matrix_1[i]);
	}
}
