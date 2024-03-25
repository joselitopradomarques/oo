package introjava;

import java.util.Scanner;

public class EstruturaDecisao {
  public static void main(String[] args) {
    int n1, n2;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero inteiro: ");
    n1 = entrada.nextInt();
    System.out.println("Digite outro numero inteiro: ");
    n2 = entrada.nextInt();

    if (n1 > n2) {
      System.out.println(n1 + " eh maior que " + n2);
    } else {
      if (n2 > n1)
        System.out.println(n2 + " eh maior que " + n1);
      else
        System.out.println("Os numeros sao iguais");
    }
  }
}
