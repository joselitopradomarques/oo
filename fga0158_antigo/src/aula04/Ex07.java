package aula04;

public class Ex07 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		vetor[0] = 0;
		vetor[1] = 1;
		System.out.print(vetor[0] + " ");
		System.out.print(vetor[1] + " ");
		for(int i = 2; vetor[i-1] + vetor[i-2] <= 34; i++) {
			vetor[i] = vetor[i-2] + vetor[i-1];
			System.out.print(vetor[i]+ " ");
		}
	}

}
