package aula04;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ex06 {

	public static void main(String[] args) {
		/* Calcular binário
		 * 
		 * Pedir um número decimal ao usuário
		 * Verificar se o número é natural
		 * 	1) Se é inteiro
		 * 	2) Se é positivo
		 * 
		 *  function dividir (int numero) {
		 *  	numero % 2 
		 *  return int resto;
		 *  
		 *  function ()
		 *  }
		 */
		int num = lerInt("Insira um número natural para converter no seu binário: ");
		ArrayList<Integer> vetorBinario = new ArrayList<>();
		int teste = num;
		
		do {
			int a = resto(teste);
			int b = modulo(teste);
			teste = a;
			vetorBinario.add(b);
		}
		while (teste != 0);
		//vetorBinario.add(1);
		
        StringBuilder sb = new StringBuilder();
        
        for (Integer elemento : vetorBinario) {
            sb.append(elemento);
        }
        sb.reverse();
        String resposta = sb.toString();
        JOptionPane.showMessageDialog(null, "O número " + num + " em binário é: " + resposta);

}
	
	static int resto(int num) {
		return num/2;
	}
	
	static int modulo (int num) {
		return num%2;
	}
	
	
	
    static int lerInt(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

			
}
