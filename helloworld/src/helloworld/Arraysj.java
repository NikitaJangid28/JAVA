package helloworld;

public class Arraysj {
		public static void main(String[] args) {
			int [] arr= {1,2,3,4,5,6};
			
			int n = arr.length;
			System.out.println(n);
			System.out.println(arr);
			System.out.println(arr[3]);// Accessing the element in array
			arr[0]=58;// changing the value of the arrays
			System.out.println(arr[0]);
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
		}
}
// types of arrays- single dimensional and multidimensional = tabular form data stored
//int [][] num= {{1,2,3},{4,5,6},{7,8,9}};