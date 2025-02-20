package helloworld;

public class SearchArray {
	public static boolean containsArray(int[]arr, int value) {
		for(int num :arr) {
			if(num == value) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		int search=90;
		if(containsArray(a, search)) {
			System.out.println(search+ " is present in array");
		}else {
			System.out.println(search+ " is not present in array");
		}
	}
	
}
