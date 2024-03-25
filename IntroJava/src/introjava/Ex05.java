package introjava;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
	
		short user_id = 1234;
		short pass_id = 9999;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o código do usuário: ");
		short user_try = entrada.nextShort();
		
		if (user_try == user_id) {
			
			System.out.println("Digite a senha: ");
			short pass_try = entrada.nextShort();
			if (pass_try == pass_id)
				System.out.println("Acesso Permitido");
			else System.out.println("Senha incorreta");
			
		}
		else
			System.out.println("Usuário inválido!");
		/* define short user_id, pass_id;
		 * 
		 * pedir ao usuário o user_try
		 * 	if(user_try == user_id)
		 * {
		 * 		pedir ao usuário a pass_try
		 * 			if (pass_try == pass_id)
		 * 				print (Acesso Permitido)
		 * 			else
		 * 				print(Senha incorreta) 	
		 * }	
		 * else 
		 * 	print(Usuário Inválido)
		 * 
		 */

	}

}
