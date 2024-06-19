package exercicioMatriz;

public class DesenhoB {

	public static void main(String[] args) {
		
		char m[][] = new char [4][4];
		
		for (int l=0; l<=3; l++) {
			for (int c=3; c>=0; c--) {
				if(l+c==3){	
					m[l][c]='*';
				}
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