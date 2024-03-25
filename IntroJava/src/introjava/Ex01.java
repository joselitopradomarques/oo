package introjava;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * Declarar int: velocidade_maxima e velocidade_motorista
		 * Função calcular_muta():
		 * 		se o motorista ultrapassar 10 km/h da vel_max -> pagar 50
		 * 		se o motorista ultrapassar 11 a 30 km/h da vel_max -> pagar 100
		 * 		se o motorista ultrapassar mais de 31 km/h da vel_max -> pagar 200
		 * 
		 ***************************************************************************
		 *
		 *int vel_max, vel_mot;
		 *
		 * 1) Ler vel_max
		 * 2) Ler vel_mot
		 *
		 * 3) if(vel_mot <= vel_max) {Motorista não paga multa}
		 * 		else
		 * 4) if(vel_mot < vel_max+10) {Motorista deve pagar uma multa de 50 reais!}
		 * 		else
		 * 5) if(vel_mot < vel_max+30) {Motorista deve pagar uma multa de 100 reais!}
		 * 		else
		 * 6) if(vel_mot < vel_max+31) {Motorista deve pagar uma multa de 200 reais!}
		 */
		
		int vel_max, vel_mot;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a velocidade maxima permitida: ");
		vel_max = entrada.nextInt();
		System.out.print("Insira a velocidade do motorista: ");
		vel_mot = entrada.nextInt();
		
		
		if(vel_mot <= vel_max) {
			System.out.println("O motorista esta dentro da velocidade permitida");
		}
		else if (vel_mot <= vel_max + 10)
			System.out.println("O motorista deve pagar 50 reais em multa!");
		else if (vel_mot <= vel_max + 30)
			System.out.println("O motorista deve pagar 100 reais em multa!");
		else
			System.out.println("O motorista deve pagar 200 reais em multa!");
	}

}
