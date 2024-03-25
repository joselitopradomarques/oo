package introjava;

import java.util.Scanner;

public class EstruturaSequencial {

    public static void main(String[] args) {
        double a1, a2, a3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a 1a altura: ");
        a1 = entrada.nextDouble();
        System.out.println("Digite a 2a altura: ");
        a2 = entrada.nextDouble();
        System.out.println("Digite a 3a altura: ");
        a3 = entrada.nextDouble();

        System.out.println("Os numeros digitados foram: " +
                a1 + ", " + a2 + " e " + a3);
    }
}
