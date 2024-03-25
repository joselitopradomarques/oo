package introjava;

import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {
        int vetInt[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero inteiro: ");
            vetInt[i] = entrada.nextInt();
        }
        entrada.close();
        	System.out.print("Voce digitou: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetInt[i] + " ");
        }
    }
}
