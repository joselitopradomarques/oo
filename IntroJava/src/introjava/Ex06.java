package introjava;

import java.util.Scanner;

public class Ex06 {
	
	public static boolean primo(int num) {
		if (num  <= 1) {
			return false;
		}
		
		for (int i = 2; i <= num-1; i++) {
			if (num % i == 0) 
				return false;
		}
	return true;
	}

	public static void main(String[] args) {
		System.out.println("Digite um número inteiro: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		entrada.close();
		if (primo(numero))
			System.out.println(numero + " é primo.");
		else
			System.out.println(numero + " não é primo.");
	}

}
