package helloworld;

public class MethodOverloading {
	static int sum(int a, int b) {
		return a+b;
	}
	static double sum(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		int num= sum(2,5);
		double decimal= sum(2.5,6.2);
		System.out.println(num+ " sum of integer values");
		System.out.println(decimal+ " sum of decimal values");
	}
}
