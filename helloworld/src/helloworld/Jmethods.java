package helloworld;

public class Jmethods {
	public static int sum(int[] arr){
		int sum=0;
		for(int num : arr) {
			sum+=num;
		}
		return sum;
	}
	public static void main(String[] args) {
		int [] numbers= {10,2,3,50};
		int result = sum(numbers);
		System.out.println(result);
	}
}
