// Try(code), Catch (error handle ), Finally(It runs even the error is occur or not), throw(error show) and throws

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int num =10/0; //This shows error
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero : " + e.getMessage()); // this block handles the exception 
        }finally{
            System.out.println("This block shows error");
        }
    }
}
