package exercicioMatriz;

public class MatrizPar {

	public static void main(String[] args) {

		int m[][] = new int [5][5];

		for(int i=0; i<5; i ++) {
			for(int j=0; j<5; j++) {
				do {
					m[i][j] = (int)Math.round(Math.random()*100);
				}while (m[i][j]%2!=0);
			}
		}
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("["+m[i][j]+"]");
			}
			System.out.println("\n--------------------");
		}
	}
}