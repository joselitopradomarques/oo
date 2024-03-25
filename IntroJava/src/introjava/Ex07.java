package introjava;

import java.util.Scanner;


public class Ex07 {

	public static void main(String[] args) {
		/*	ler:
		 * 		- string: descrição do produto
		 * 		- float: quantidade adquirida
		 * 		- float: preço unitário
		 * 
		 * escrever:
		 * 		- float: total
		 * 		- float: desconto
		 * 		- float: total a pagar
		 * 
		 * detalhes sobre desconto
		 * 		- se quantidade <= 5 -> desconto será 2%
		 * 		- se quantidade > 5 e quantidade <= 10 -> desconto será 3%
		 * 		- se quantidade > 10 -> o desconto será de 5%
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a descrição do produto: ");
		String descricao = entrada.next();
		System.out.print("Dgite a quantidade do produto: ");
		double quantidade = entrada.nextDouble();
		System.out.print("Digite o preço unitário: ");
		double unit_price = entrada.nextDouble();
		
		double desconto = 0.0, desconto_valor, total, total_final;
		
		if (quantidade <= 5)
			desconto = 0.02;
		else if (quantidade > 5 || quantidade <= 10 )
			desconto = 0.03;
		else if (quantidade > 10)
			desconto = 0.05;
			else System.out.println("Quantidade inválida.");
			
		total = quantidade*unit_price;
		desconto_valor = total*desconto;
		total_final = total - desconto;
		
		System.out.println("O valor total do " + descricao +" foi de R$ " + total);
		System.out.println("O valor do desconto em cima da " + descricao + " foi de R$ " + desconto_valor);
		System.out.println("O valor final é de R$ "+ total_final);
		
		
		
	}

}
