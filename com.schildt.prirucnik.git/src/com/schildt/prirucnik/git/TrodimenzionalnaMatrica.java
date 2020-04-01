package com.schildt.prirucnik.git;

public class TrodimenzionalnaMatrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int troDim[][][]= new int [3][4][5];
		int i, j, k;
		
		for (i=0; i<3; i++) 
			for (j=0; j<4; j++)
				for(k=0; k<5; k++)
					troDim[i][j][k]= i*j*k;
		
			for(i=0; i<3;i++) {
				for(j=0; j<4; j++) {
					for(k=0; k<5; k++)
						System.out.print(troDim[i][j][k]+" ");
				System.out.println();
			}
			System.out.println();
		}
	

}
}
