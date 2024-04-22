package chap06;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=2 , columns=3;
		int[][] firstMatrlx= {{2,3,4},{3,2,1}};
		int[][] secondMatrlx= {{1,2,3},{-4,-2,1}};
		
		int[][] sum=new int[rows][columns];
		
		for (int i=0;i<rows;i++) {
			for(int j=0; j<columns;j++) {
				sum[i][j]=firstMatrlx[i][j]+secondMatrlx[i][j];
			}
		}
		
		for (int i=0;i<rows;i++) {
			for(int j=0; j<columns;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("");
		}
		
		


	}

}
