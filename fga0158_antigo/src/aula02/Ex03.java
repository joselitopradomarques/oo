package aula02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número A: ");
		float a = entrada.nextFloat();
		System.out.print("Digite o número B: ");
		float b = entrada.nextFloat();
		System.out.print("Digite o número C: ");
		float c = entrada.nextFloat();
		
		boolean x = false;
		x = a*a == (b*b+c*c);
		
		System.out.println(x);
	}

}
