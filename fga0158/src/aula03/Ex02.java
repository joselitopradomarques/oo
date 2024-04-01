package aula03;

/*
 * Solicite ao usuário o preenchimento de um vetor de valores inteiros
 * o tamanho do vetor é x
 * o tamanho deve ser informado pelo usuário
 * 
 * 
 * quais devem ser as saídas
 * 1) a média dos valores lidos
 * 2) quantidade de números positivos
 * 3) quantidade de números negativos
 * 4) quantidade de zeros
 * 5) quantidade de números pares
 * 6) quantidade de números ímpares
 * 
 * criar uma função para cada caso
 */

import javax.swing.JOptionPane;

/**
 * "Pontapé" para o exercicio 2. 
 * IMPORTANTE: 
 *   - O esboço em estágio muito inicial está apresentado a seguir. Cabe a cada 
 *     aluno terminar o desenvolvimento do exercicio
 *   - Atente-se para o uso constante de funções e procedimentos nesse esboco. 
 *     Continue desenvolvendo, sempre que possível, através de funções. 
 * @author andre
 *
 */
public class Ex02 {

	/**
	 * Metodo MAIN: ponto de inicio da execucao do algoritmo.	
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Declaracao de variaveis
		 */
		int qtdeValores;
		int[] numeros;
		float media; 
		int positivos;
	    int negativos = 0;
	    int zeros = 0;
	    int pares = 0;
	    int impares = 0;
		// ... demais variaveis
		
		
		/*
		 * Inicio da execucao do algoritmo
		 */
		qtdeValores = lerInteiro("Informe o numero de valores a serem lidos");
		
		//instanciacao do vetor
		numeros = preencherVetor(qtdeValores);
		
		//calculo da media
		media = calcularMedia(numeros);
		
		// Cálculo de números positivos
		positivos = calcularPositivo(numeros);
		
		// Cálculo de números negativos
		negativos = calcularNegativo(numeros);
		
		// Cálculo de zeros
		zeros = calcularZero(positivos, negativos, numeros);
		
		// Cálculo de pares
		pares = calcularPar(numeros);
		
		// Cálculo de ímpares
		impares = qtdeValores - pares ;
		
	     // Construir a mensagem com os resultados
        String mensagem = "Resultados:\n";
        mensagem += "Média dos valores: " + media + "\n";
        mensagem += "Quantidade de números positivos: " + positivos + "\n";
        mensagem += "Quantidade de números negativos: " + negativos + "\n";
        mensagem += "Quantidade de zeros: " + zeros + "\n";
        mensagem += "Quantidade de números pares: " + pares + "\n";
        mensagem += "Quantidade de números ímpares: " + impares + "\n";

        // Exibir os resultados em uma única janela
        JOptionPane.showMessageDialog(null, mensagem, "Resultados", JOptionPane.INFORMATION_MESSAGE);
}
	/**
	 * Funcao para calcular a media dos valores do vetor
	 * @param numeros vetor de numeros inteiros, para o qual será calculada a media
	 * @return media dos valores do vetor
	 */
	private static float calcularMedia(int[] numeros) {
		
		float media = 0;
		int n = numeros.length; // Obtenção do tamanho do vetor
		
		for(int i = 0; i < n; i++) {
			media = media + numeros[i];
			}
		media = media / n;
		//retorno da media
		return media;
	}
	
	/**
	 * Funcao que obtém a quantidade de valores positivos dentro do vetor
	 * @param numeros vetor de numeros inteiros, para o qual será calculado a quantidade de números naturais 
	 * @return numero inteiro com a quantidade de números naturais
	 */
	private static int calcularPositivo(int[] numeros) {
		int n = numeros.length;
		int positivos = 0;
		
		for(int i=0; i < n; i++){
			if(numeros[i]>0)
				positivos++;
			
		}
		return positivos;
	}
	
	/**
	 * Funcao que obtém a quantidade de valores negativos dentro do vetor
	 * @param numeros vetor de numeros inteiros, para o qual será calculado a quantidade de números negativos
	 * @return numero inteiro com a quantidade de números negativos
	 */
	private static int calcularNegativo(int[] numeros) {
		int n = numeros.length;
		int negativos = 0;
		
		for(int i=0; i < n; i++){
			if(numeros[i]<0)
				negativos++;
			
		}
		return negativos;
	}
	
	/**
	 * Funcao que obtém a quantidade de zeros dentro do vetor
	 * @param numeros vetor de numeros positivos, negativos e vetor números 
	 * @return numero inteiro com a quantidade de zeros
	 */
	private static int calcularZero(int positivos, int negativos, int[] numeros) {
		int n = numeros.length;
		int zero = n - positivos - negativos;
		
		return zero;
	}
	
	/**
	 * Funcao que obtém a quantidade de valores pares dentro do vetor
	 * @param numeros vetor de numeros inteiros, para o qual será calculado a quantidade de números pares
	 * @return numero inteiro com a quantidade de números pares
	 */
	private static int calcularPar(int[] numeros) {
		int n = numeros.length;
		int pares = 0;
		
		for(int i=0; i < n; i++){
			if(numeros[i]%-2==0)
				pares++;
			
		}
		return pares;
	}
	

	/**
	 * Metodo que instancia e preenche o vetor com os valores inteiros.
	 * @param n numero de valores a serem lidos do teclado
	 * @return vetor preenchido com n valores
	 */
	private static int[] preencherVetor(int n) {
		// instanciacao do vetor com n posicoes
		
		// leitura dos n valores a partir do teclado
		// Aqui você pode reaproveitar uma função já disponível nesse esboco?  
		
		// retorno do vetor para a funcao principal
		int[] vetor = new int[n]; // Declaração do vetor de tamanho n a ser preenchido pelo usuário
	    for (int i = 0; i < n; i++) { // For Loop para o preenchimento do vetor. Ao mesmo tempo, é printado ao usuário qual o índice da localização do número do vetor
	        vetor[i] = lerInteiro("Informe o valor " + (i+1) + " do vetor:"); // Aqui é alocado em cada espaço do vetor
	    }
	    return vetor;
	}

	/**
	 * Funcao que le um valor do teclado e retorna-o como um inteiro
	 * @param mensagem Mensagem a ser apresentada ao usuário quando a funcao for chamada
	 * @return valor inteiro lido a partir do teclado
	 */
	private static int lerInteiro(String mensagem) {
		String strNumero = JOptionPane.showInputDialog(mensagem);
		int numero = Integer.parseInt(strNumero);  //<--- down-casting de String para int
		return numero;
	}
	

}