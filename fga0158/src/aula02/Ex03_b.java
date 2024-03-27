package aula02;

import javax.swing.JOptionPane;

public class Ex03_b {

    public static void main(String[] args) {

        String inputA = JOptionPane.showInputDialog("Digite o número A:");
        float a = Float.parseFloat(inputA);

        String inputB = JOptionPane.showInputDialog("Digite o número B:");
        float b = Float.parseFloat(inputB);

        String inputC = JOptionPane.showInputDialog("Digite o número C:");
        float c = Float.parseFloat(inputC);

        boolean x = a * a == (b * b + c * c);

        JOptionPane.showMessageDialog(null, x);
    }
}
