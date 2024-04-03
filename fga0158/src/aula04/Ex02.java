package aula04;

/* Vetor de números de 0 a 20
 * 
 * @args -> n: tamanho do vetor
 * 			valores do vetor
 * @proc ->
 * 
 * @return -> 
 */

import java.util.Scanner;
import java.util.Arrays;


public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // Declarando Scanner como uma variável estática

		System.out.print("Digite a quantidade de valores a serem lidos: ");
		int x = entrada.nextInt();
		int[] vetor = new int[x];
		
		for(int i = 0; i < x; i++) {
			int index = i + 1;
			System.out.print("Digite um valor para o elemento " + index + ": ");
			int value = entrada.nextInt();
			vetor[i] = value;
		}
		int[] sorted_vetor = vetor.clone();
		Arrays.sort(sorted_vetor);
		
		System.out.print("Vetor original: [ ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if (i < vetor.length -1) 
				System.out.print(", ");;
		}
		System.out.println(" ]");
		
		System.out.print("Vetor ordenado: [ ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(sorted_vetor[i]);
			if (i < vetor.length -1) 
				System.out.print(", ");;
		}
		System.out.print(" ]");
		
		entrada.close();
	}
	

}
