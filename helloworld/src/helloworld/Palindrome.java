package helloworld;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num =sc.nextInt();
		int rev=0, original=num;
		for ( int i=num; i>0;i/=10){
			int n= i%10;
			rev= rev *10+n;//121
		}
		if(original == rev) {
			System.out.println(original + " is a Palindrome.");
		}
		else {
			System.out.println(original + "is not a Palindrome.");
		}
	}
}



// o= 121
//i=121 
//n= i%10 = 121 %10=1
//rev *10+n = 0 *10+1=1
//i/=10= 121/10= 12
//i = 12
//n= i%10 = 12%10 = 2
1*10+1=12
12/10=1
i=1
1%10=1
12*10+1=121
1/10=0 

