package aula03;

import javax.swing.JOptionPane;

/*
 *  Exercício Palíndromo
 *  
 *  1) Obter frase do usuário
 *  2) Funções de limpeza de dados
 *  	a) replaceAll() :
 *  		entrada: string com a frase digitada pelo usuário
 *  		process: retira todos espaços e caracteres da string
 *  		saída: string de frase sem espaços ou símbolos
 *  	b) toLowerCase() :
 *  		@param : string de frase sem espaços ou símbolos
 *  		process: modifica todas letras MAIÚSCULAS por minúsculas
 *  		@return : string de letras sendo todas minúsculas sem sínbolos nem espaços
 *  	c) ehPalindromo() :
 *  		@param : string com as frases sem espaços nem quaisquer outro símbolo e minuscles
 *  		process: compara a casa message[0] com message[N], percorra até que se encontre n/2
 *  		@return boolean: se a frase é ou não um palindromo
 */

public class Ex03 {
    
    //Função para obter a frase usando entrada gráfica
    public static String obterFrase() {
        // Mostrando uma caixa de diálogo para o usuário digitar a frase
        String frase = JOptionPane.showInputDialog("Digite uma frase:");
        return frase;
        }
    
    public static String processamento(String[] palavras) {
    	/*
    	 * entrada: frase digitada pelo usuário
    	 * process: modifica todas letras MAIÚSCULAS por minúsculas
    	 * saída: string de frase
    	 */
    	
        StringBuilder fraseLimpa = new StringBuilder(); // Usaremos um StringBuilder para eficiência
        
        for (String palavra : palavras) {
        	fraseLimpa.append(palavra.toLowerCase().replaceAll("[^a-z0-9]", ""));
        }
        
        return fraseLimpa.toString();
    }
  
    public static String inverterString(String texto) {
        // Verifica se o texto é nulo ou vazio
        if (texto == null || texto.isEmpty()) {
            return texto;
        }

        // Converte a string para um array de caracteres
        char[] caracteres = texto.toCharArray();
        
        // Inverte os caracteres no array
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }
        
        // Converte o array de caracteres de volta para uma string e retorna
        return new String(caracteres);
    }

    

    public static void main(String[] args) {
        // Chamando a função para obter a frase
        String frase = obterFrase();
        String[] palavras = frase.split(" ");
        String fraseLimpa = processamento(palavras);
        String inverso = inverterString(fraseLimpa);
        
        String mensagem = "Frase digitada: " + frase + "\nFrase limpa: " + fraseLimpa;
        
        if (fraseLimpa.equals(inverso)) {
        	JOptionPane.showMessageDialog(null, "As frases são Palindromos");
        } else {
        	JOptionPane.showMessageDialog(null, "As frases não são Palindromos");
        }
    }

}