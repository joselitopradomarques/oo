package aula04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = obterVetor();
        vetor.sort(null);
        
        HashMap<Integer, Integer> ocorrencias = contarOcorrencias(vetor);
        
        for (Integer chave : ocorrencias.keySet()) {
            Integer valor = ocorrencias.get(chave);
            System.out.print(chave + " ");
            imprimirAsteriscos(valor);
            System.out.println();
        }
    }
    
    public static HashMap<Integer, Integer> contarOcorrencias(ArrayList<Integer> vetor) {
        HashMap<Integer, Integer> ocorrencias = new HashMap<>();
        
        for (Integer numero : vetor) {
            if (ocorrencias.containsKey(numero)) {
                ocorrencias.put(numero, ocorrencias.get(numero) + 1);
            } else {
                ocorrencias.put(numero, 1);
            }
        }
        
        return ocorrencias;
    }
    
    public static ArrayList<Integer> obterVetor() {
        ArrayList<Integer> vetor = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um valor inteiro (ou 'parar' para encerrar): ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("parar")) {
                break;
            }
            
            try {
                int valor = Integer.parseInt(entrada);
                vetor.add(valor);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira apenas valores inteiros ou 'parar'.");
            }
        }
        
        scanner.close();
        return vetor;
    }
    
    public static void imprimirAsteriscos(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
    }
}
