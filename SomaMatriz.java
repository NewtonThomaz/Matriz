package exercicioMatriz;

public class SomaMatriz {

	public static void main(String[] args) {
		int m[][] = new int [5][5];
		int soma=0;

		for(int i=0; i<5; i ++) {
			for(int j=0; j<5; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
				soma += m[i][j];
			}
		}
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("["+m[i][j]+"]");
			}
			System.out.println("\n---------------------");
		}
		System.out.println("A soma dos valores da matriz é "+soma);
	}
}