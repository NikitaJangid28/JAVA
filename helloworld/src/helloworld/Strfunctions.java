package helloworld;

public class Strfunctions {
	public static void main(String [] args) {
		String greeting= " Hello JAVA, you are oop language";
		System.out.println(greeting.length());
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.toLowerCase());
		System.out.println(greeting.indexOf("Hello"));
		
		//String Concatenation 
		String fname="John ";
		String lname="smith";
		System.out.println(fname+lname);
		System.out.println(fname.concat(lname));
		
		// number and String 
		int a =10;
		int b = 20;
		System.out.println(a+b);
		String x ="10";
		String y= "20";
		System.out.println(x+y);
				
		// Special characters
		
		String g= " Hello JAVA, you are \"OOPS\" language";
		String c= "isn\'t";
		System.out.println(g);
		System.out.println(c);
	}

}
