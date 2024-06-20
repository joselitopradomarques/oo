package aula04;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
	    // Type Casting: Não há typecasting pois o valor de A já foi salvo como String na variável strA
	    String strA = JOptionPane.showInputDialog("Informe o valor de A"); //leu-se o valor 13.5

	    // Type Casting: Não há typecasting pois o valor de B já foi salvo como String na variável strB
	    String strB = JOptionPane.showInputDialog("Informe o valor de B"); //leu-se o valor 5

	    // Type Casting: float a = 13.5f downcasting ou explícita
	    float a = Float.parseFloat(strA);
	    // Type Casting:  int b = 5 downcasting ou explícita
	    int b = Integer.parseInt(strB); 
	    
	    // Type Casting: downcasting ou explícita
	    JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b));
	    // Resultado = 18
	    // Type Casting: upcasting ou implícita
	    JOptionPane.showMessageDialog(null, "A - B = " + (a - b));
	    // Resultado = 8.5
	}

}
