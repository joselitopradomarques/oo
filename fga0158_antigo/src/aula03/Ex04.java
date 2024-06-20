package aula03;

/*
 * Ler duas matrizes M1 (MxN) e M2 (OxP)
 * 1) Ler dimensões:
 * 		a) M
 * 		b) N
 * 		c) O
 * 		d) P
 * 
 * 2) Verificar se a multiplicação das matrizes é possível
 * 		condição: se N == o
 * 				M3 é (MxP)
 * 		else 	não é possível realizar a multiplicação das matrizes
 * 3) Calcular a matriz resultante M3
 */

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Entrada de dimensões das matrizes
        System.out.println("Informe as dimensões da matriz M1 MxN: ");
        int m1Rows = entrada.nextInt();
        int m1Cols = entrada.nextInt();
        
        System.out.println("Informe as dimensões da matriz M2 OxP: ");
        int m2Rows = entrada.nextInt();
        int m2Cols = entrada.nextInt();
        
        // Verificar se a multiplicação das matrizes é possível
        if (m1Cols != m2Rows) {
            System.out.println("Não é possível realizar a multiplicação dessas matrizes devido às dimensões.");
            return;
        }
        
        // Inicialização das matrizes
        int[][] matriz1 = new int[m1Rows][m1Cols];
        int[][] matriz2 = new int[m2Rows][m2Cols];
        int[][] matrizResultado = new int[m1Rows][m2Cols];
        
        // Preenchimento das matrizes
        System.out.println("Preencha a matriz M1:");
        preencherMatriz(matriz1, entrada);
        
        System.out.println("Preencha a matriz M2:");
        preencherMatriz(matriz2, entrada);
        
        // Cálculo da matriz resultante
        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                for (int k = 0; k < m1Cols; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        
        // Impressão da matriz resultante
        System.out.println("A matriz resultante do produto das duas matrizes é:");
        imprimirMatriz(matrizResultado);
        
        entrada.close(); // Fechar o scanner após o uso
    }
    
    private static void preencherMatriz(int[][] matriz, Scanner entrada) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
