package introjava;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Obter um caractere
		 * 
		 * Se for numerico -> print("Eh numerico!")
		 * Se for vogal -> print("Eh vogal!")
		 * Se for consoante -> print("Eh consoante")
		 * Se não -> print("Eh outro tipo de caractere!")
		*/
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um caractere: ");
		char caractere = entrada.next().charAt(0);
		System.out.print("O primeiro caractere digitado foi \"" + caractere + "\"");
		
		if (Character.isDigit(caractere))
			System.out.print(" e eh um numero!");
		else if (Character.isLetter(caractere)) {
			if(caractere == 'a' || caractere == 'e' ||caractere == 'i' ||caractere == 'o' ||caractere == 'u' )
				System.out.print(" e eh uma vogal!");
			else
				System.out.print(" e eh uma letra!");
		}
		else
			System.out.print(" e eh outro simbolo");		
	}

}
