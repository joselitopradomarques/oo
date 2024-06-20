package aula04;

public class Questao2a {

	public static void main(String[] args) {
		
		int [] x = new int[] {1, 0, 1, 1, 0, 0, 1};
		int y = 3; 
		
		int z = 0;
		
		for (int i=x.length; i>0; i--) {
		z += calcular(y, Math.abs(i - x.length), x[i-1]);
		}
		System.out.println(z);
	}
	
	static int calcular(int k, int l, int m) {
		int j = 1;
		for (int i = 1; i>0; i--) {
			j *= k;
		}
		j *= m;
		System.out.println(j);
		return j;
	}

}
