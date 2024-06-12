package exercicioMatriz;

public class Exercicio01 {

	public static void main(String[] args) {

		int m[][] = new int [3][3];

		for(int i=0; i<3; i ++) {
			for(int j=0; j<3; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("["+m[i][j]+"]");
			}
			System.out.println("\n------------");
		}
	}
}