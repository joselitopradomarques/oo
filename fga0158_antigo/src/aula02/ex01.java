package aula02;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String name = entrada.next();
		System.out.println("Olá " + name + ", seja bem vinde!");
	}

}
