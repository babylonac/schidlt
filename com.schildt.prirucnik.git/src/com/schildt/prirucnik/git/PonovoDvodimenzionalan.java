package com.schildt.prirucnik.git;
//Ruèno dodeljivanje razlièitog broja elemenata u drugoj dimenziji
public class PonovoDvodimenzionalan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dvoDimenzionalni [][]= new int [4][];
		dvoDimenzionalni [0]= new int [1];
		dvoDimenzionalni [1]= new int [2];
		dvoDimenzionalni [2]= new int [3];
		dvoDimenzionalni [3]= new int [4];
		
		int i, j, k=0;
		
		for (i=0; i<4; i++)
			for(j=0; j<i+1; j++) {
				dvoDimenzionalni [i][j] =k;
				k++;
			}
		
		for(i=0; i<4; i++) {
			for(j=0; j<i+1; j++)
				System.out.print(dvoDimenzionalni[i][j]+" ");
			System.out.println();
		}
	}

}
