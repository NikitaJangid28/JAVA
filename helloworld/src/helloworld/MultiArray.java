package helloworld;

public class MultiArray {
	public static void main(String[] args) {
		int [][] num= {{1,2,3},{4,5,6}};
		//System.out.println(num[0][1]);
		//num[1][2]=9;
		//System.out.println(num[1][2]);
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++){
				System.out.printf("%-6d", num[i][j] );
				
			}
			System.out.println();
		}
	}
}
