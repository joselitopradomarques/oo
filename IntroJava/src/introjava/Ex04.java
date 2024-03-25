package introjava;

import java.util.Scanner;



public class Ex04 {

	public static void main(String[] args) {
		/* define int dat_a, dat_b, dd_a, 
		 * 
		 * Requisitar ao usuário a dat_a;
		 * Requisitar ao usuário a dat b;
		 * 
		 * 1) Obter dd_a, dd_b, mm_a, mm_b, aaaa_a e aaaa_b
		 * 2) árvore de if e else if e else ao final para definir que são iguais		 * 
		 */
		
		int data_a, data_b;
		String msg = "A data maior eh: ";
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Esse código realiza a comparação entre duas datas.");
		System.out.println("A maior data será plotada ao final.");
		System.out.print("Digite uma data no formato \"ddmmaaaa\": ");
		data_a = entrada.nextInt();
		System.out.print("Digite outra data no formato \"ddmmaaaa\": ");
		data_b = entrada.nextInt();
		entrada.close();
		
		if(data_a == data_b)
			System.out.println("As datas inseridas são iguais!");
		else {
				int ano_a = data_a % 10000;
				int ano_b = data_b % 10000;
				int mes_a = (data_a / 10000) % 100;
				int mes_b = (data_b / 10000) % 100;
				int dia_a = (data_a / 1000000) % 100;
				int dia_b = (data_b / 1000000) % 100;
				
				String data_barra_a = dia_a + "/" + mes_a + "/" + ano_a; 
				String data_barra_b = dia_b + "/" + mes_b + "/" + ano_b;
				
				
				if (ano_a > ano_b)
					System.out.println(msg + data_barra_a);
				else if(ano_a < ano_b)
					System.out.println(msg + data_barra_b);
				else if (mes_a > mes_b)					
					System.out.println(msg + data_barra_a);
				else if (mes_a < mes_b)
					System.out.println(msg + data_barra_b);
				else if(dia_a > dia_b)				
					System.out.println(msg + data_barra_a);
				else
					System.out.println(msg + data_barra_b);	
					}}}
