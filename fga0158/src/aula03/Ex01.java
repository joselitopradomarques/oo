package aula03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex01 {
	
	public static double circulo_area(double raio) {
		return (Math.PI*raio*raio);
	}
	
	public static double circulo_peri(double raio) {
		return (2*Math.PI*raio);
	}
	
	public static double quadrado_peri(double lado) {
		return (4*lado);
	}

	public static double quadrado_area(double lado) {
		return (lado*lado);
	}
	
	public static double retangulo_peri(double a, double b) {
		return (2*(a+b));
	}
	
	public static double retangulo_area(double a, double b) {
		return (a*b);
	}
	
	public static double trapezio_peri(double base_maior, double base_menor, double altura) {
		double perimetro = base_maior + base_menor + 2*altura;
		return (perimetro);
	}
	
	public static double trapezio_area (double base_maior, double base_menor, double altura) {
		double trapezio_area = (base_maior + base_menor)*altura/2;
		return (trapezio_area);
	}

	public static double area_triangulo(double a, double b, double c) {
		double semi = semiperimetro_triangulo(a,b,c);
		return Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
	}
	
	public static double perimetro_triangulo(double a, double b, double c) {
		return (a+b+c);
	}
	
	public static double semiperimetro_triangulo(double a, double b, double c) {
		double semiperimetro = perimetro_triangulo(a, b, c);
		return (semiperimetro);
	}
	
	public static void plot(String figura, double peri, double area) {
		DecimalFormat df = new DecimalFormat("#.#");
		String peri_formatado = df.format(peri);
		String area_formatado = df.format(area);
		
		
		System.out.println("O perímetro do " + figura + " é " + peri_formatado + " e a área é de " + area_formatado +".");
	}
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha a figura geométrica desejada: ");
        System.out.println("1 - Círculo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Trapézio");
		int opcao = entrada.nextInt();
	
		/* Criar uma função para capturar os dados para cada tipo de figura
		 * 
		 */
		
		switch(opcao) {
	    case 1:
            System.out.print("Digite o raio do círculo: ");
	    	double raio = entrada.nextDouble();
	    	entrada.close();
	    	double area = circulo_area(raio);
	    	double peri = circulo_peri(raio);
	    	String figura = "círculo";
	    	plot(figura, peri, area);
	        break;
	    case 2:
            System.out.print("Digite o lado do quadrado: ");
            double lado = entrada.nextDouble();
            entrada.close();
            double peri2 = quadrado_peri(lado);
            double area2 = quadrado_area(lado);
            String figura2 = "quadrado";
            plot(figura2, peri2, area2);
	        break;
	        
	    case 3:
	        // Caso 3: Retângulo
	        // Código para calcular a área do retângulo
	        break;
	    case 4:
	        // Caso 4: Trapézio
	        // Código para calcular a área do trapézio
	        break;
	    case 5:
	        // Caso 5: Outra figura geométrica
	        // Código para calcular a área da outra figura geométrica
	        break;
	    default:
	        // Caso padrão para opções inválidas
	        System.out.println("Opção inválida!");
	}

	}

}
