package exercicioMatriz;

public class DesenhoC {

	public static void main(String[] args) {
		
		char m[][] = new char [5][5];

		for (int l=0; l<5; l++) {
			for (int c=0; c<5; c++) {
					m[2][c]='*';
					m[l][2]='*';
			}
		}
		for (char[] l:m) {
			for (char c:l) {
				System.out.print(c+"\t");
			}
			System.out.println();
		}
	}
}