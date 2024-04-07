package aula04;
import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		float a = lerFloat("Informe A:");
		float b = lerFloat("Informe B:");
		float c = lerFloat("Informe C:");
		
		String resposta = "";
		
		if (ehTriangulo(a, b, c)) {
			resposta += "Os lados informados formam um triangulo.\n";
			if (equilatero(a, b, c)) {
				resposta += "É um triangulo equilatero.\n";
			} else if (isosceles(a, b, c)) {
				resposta += "É um triangulo isosceles.\n";
			} else { 
				resposta += "É um triangulo escaleno.\n"; 
			}
			
			if (ehTrianguloRetangulo(a, b, c)) {
				resposta += "É um triangulo retangulo.";
			}
		} else {
			resposta += "Os valores informados não formam um triangulo.";
		}
		
		JOptionPane.showMessageDialog(null, resposta);
	}


	static boolean ehTrianguloRetangulo(float a, float b, float c) {
		boolean resposta = ( (a * a == b * b + c * c) || 
			                 (b * b == a * a + b * c) ||
			                 (c * c == a * a + b * b));
		return resposta;
	}


	static boolean isosceles(float a, float b, float c) {
		boolean resposta = ((a == b && a != c) || 
				            (a == c && a != b) ||
				            (b == c && b != a));
		return resposta;
	}

	static boolean equilatero(float a, float b, float c) {
		boolean resposta = (a == b && a == c);
		return resposta;
	}

	static boolean ehTriangulo(float a, float b, float c) {
		return (( a > Math.abs(b - c) && a < Math.abs(b + c)) && 
				( b > Math.abs(a - c) && b < Math.abs(a + c)) && 
				( c > Math.abs(a - b) && c < Math.abs(a + b)));
	}

	static float lerFloat(String msg) {
		String str = JOptionPane.showInputDialog(msg);
		float f = Float.parseFloat(str);
		return f;
	}

}