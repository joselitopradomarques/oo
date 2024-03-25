package introjava;

/* Bhaskara exercicio
 * 
 */

import java.util.Scanner;

public class Ex03{

	public static void main(String[] args) {
		/*	variaveis float a, b, c;
		 * 
		 * delta = b*b-4*a*c;
		 * 
		 * if(delta<0) -> print(O sistema não possui raízes reais)
		 * else if (delta = 0) -> x1 = -b/2a
		 *	 else
		 *	x1 = (-b+sqrt(delta))/2a
		 *	x2 = (-b-sqrt(delta))/2a
		 */
		double a, b, c, delta, x1, x2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sendo uma equacao do segundo grau no formato \" ax² + bx + c = 0\".");
		System.out.print("Digite o coeficiente \"a\": ");
		a = entrada.nextDouble();
		System.out.print("Digite o coeficiente \"b\": ");
		b = entrada.nextDouble();
		System.out.print("Digite o coeficiente \"c\": ");
		c = entrada.nextDouble();
		
		delta = (Math.pow(b, 2) - 4*a*c);
		
		if (delta < 0)
			System.out.println("Não possui raizes reais!");
		else
		{
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("As raízes da equacao são x1 = "+ x1 + " e x2 = " + x2 + ".");
		}
	}

}
