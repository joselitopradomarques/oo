package aula03;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

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
		double semiperimetro = perimetro_triangulo(a, b, c)/2;
		return (semiperimetro);
	}
	
	public static void plot(String figura, double peri, double area) {
		DecimalFormat df = new DecimalFormat("#.#");
		String peri_formatado = df.format(peri);
		String area_formatado = df.format(area);
		System.out.println("O perímetro do " + figura + " é " + peri_formatado + " e a área é de " + area_formatado +".");
	}
	
	public static boolean testetriangulo(double a, double b, double c) {
	    boolean rule_01 = (Math.abs(b - c) < a) && (a < b + c);
	    boolean rule_02 = (Math.abs(a - c) < b) && (b < a + c);
	    boolean rule_03 = (Math.abs(a - b) < c) && (c < a + b);
		return rule_01 && rule_02 && rule_03;
	}
	
    public static boolean TrianguloRetangulo(double lado1, double lado2, double lado3) {
        // Encontrar o quadrado dos lados
        double quadradoLado1 = lado1 * lado1;
        double quadradoLado2 = lado2 * lado2;
        double quadradoLado3 = lado3 * lado3;
        
        // Verificar se é um triângulo retângulo usando o Teorema de Pitágoras
        boolean eRetangulo = false;
        if (quadradoLado1 + quadradoLado2 == quadradoLado3 ||
            quadradoLado1 + quadradoLado3 == quadradoLado2 ||
            quadradoLado2 + quadradoLado3 == quadradoLado1) {
            eRetangulo = true;
        }
        
        return eRetangulo;
    }
 // Detectar quem são os catetos
    public static double areapitagoras(double lado1, double lado2, double lado3) {
        // Ordenar os lados em ordem crescente
        double[] lados = {lado1, lado2, lado3};
        Arrays.sort(lados);
        
        double cateto1 = lados[0];
        double cateto2 = lados[1];
        
        return cateto1*cateto2/2;
    }
	
	public static double[] obterParametros(String figura, Scanner entrada) {
        double[] parametros = new double[3]; // Array para armazenar os parâmetros
        
        switch (figura) {
            case "círculo":
                System.out.print("Digite o raio do círculo: ");
                parametros[0] = entrada.nextDouble(); // Armazena o raio
                break;
            case "quadrado":
                System.out.print("Digite o lado do quadrado: ");
                parametros[0] = entrada.nextDouble(); // Armazena o lado
                break;
            case "retângulo":
                System.out.print("Digite a base do retângulo: ");
                parametros[0] = entrada.nextDouble(); // Armazena a base
                System.out.print("Digite a altura do retângulo: ");
                parametros[1] = entrada.nextDouble(); // Armazena a altura
                break;
            case "trapézio":
                System.out.print("Digite a base maior do trapézio: ");
                parametros[0] = entrada.nextDouble(); // Armazena a base maior
                System.out.print("Digite a base menor do trapézio: ");
                parametros[1] = entrada.nextDouble(); // Armazena a base menor
                System.out.print("Digite a altura do trapézio: ");
                parametros[2] = entrada.nextDouble(); // Armazena a altura
                break;
            case "triângulo":
            	System.out.print("Digite o lado a do triângulo: ");
            	parametros[0] = entrada.nextDouble(); // Armazena o lado a
            	System.out.print("Digite o lado b do triângulo: ");
            	parametros[1] = entrada.nextDouble(); // Armazena o lado b
            	System.out.print("Digite o lado c do triângulo: ");
            	parametros[2] = entrada.nextDouble(); // Armazena o lado c
            	break;
            default:
                System.out.println("Figura geométrica inválida!");
                break;
        }
        
        return parametros;
    }
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha a figura geométrica desejada: ");
        System.out.println("1 - Círculo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Trapézio");
        System.out.println("5 - Triângulo");
		int opcao = entrada.nextInt();
	
		/* Criar uma função para capturar os dados para cada tipo de figura
		 * 
		 */
		
		switch (opcao) {
        case 1:
            double[] paramsCirculo = obterParametros("círculo", entrada);
            double raio = paramsCirculo[0];
            double periCirculo = circulo_peri(raio);
            double areaCirculo = circulo_area(raio);
            plot("círculo", periCirculo, areaCirculo);
            break;
        case 2:
            double[] paramsQuadrado = obterParametros("quadrado", entrada);
            double lado = paramsQuadrado[0];
            double periQuadrado = quadrado_peri(lado);
            double areaQuadrado = quadrado_area(lado);
            plot("quadrado", periQuadrado, areaQuadrado);
            break;
        case 3:
            double[] paramsRetangulo = obterParametros("retângulo", entrada);
            double base = paramsRetangulo[0];
            double altura = paramsRetangulo[1];
            double periRetangulo = retangulo_peri(base, altura);
            double areaRetangulo = retangulo_area(base, altura);
            plot("retângulo", periRetangulo, areaRetangulo);
            break;
        case 4:
            double[] paramsTrapezio = obterParametros("trapézio", entrada);
            double baseMaior = paramsTrapezio[0];
            double baseMenor = paramsTrapezio[1];
            double alturaTrapezio = paramsTrapezio[2];
            double periTrapezio = trapezio_peri(baseMaior, baseMenor, alturaTrapezio);
            double areaTrapezio = trapezio_area(baseMaior, baseMenor, alturaTrapezio);
            plot("trapézio", periTrapezio, areaTrapezio);
            break;
        case 5:
        	double[] paramsTriangulo = obterParametros("triângulo", entrada);
        	double lado_a = paramsTriangulo[0];
        	double lado_b = paramsTriangulo[1];
        	double lado_c = paramsTriangulo[2];
        	if(testetriangulo(lado_a, lado_b, lado_c) == true) {
            	double periTriangulo = perimetro_triangulo(lado_a, lado_b, lado_c);
        		if (TrianguloRetangulo(lado_a, lado_b, lado_c) == true ) {
        			double areaTriangulo = areapitagoras(lado_a, lado_b, lado_c);
        			System.out.println("Esse triângulo é retângulo!");
        			plot("triângulo", periTriangulo, areaTriangulo);
        		}
        		else {
	            	double areaTriangulo = area_triangulo(lado_a, lado_b, lado_c);
	            	plot("triângulo", periTriangulo, areaTriangulo);
                	}
        		}
        	else 
        		System.out.println("Os lados desse triângulo não formam um triângulo válido!");
        	break;
        default:
            System.out.println("Opção inválida!");
    }
	}
}
