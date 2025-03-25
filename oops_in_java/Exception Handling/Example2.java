
public class Example2 {
    public static void main(String[] args) {
        try {
            int[] arr={1,2,3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bound");
        }
        finally{
            System.out.println("this block always executes");
        }
        /*int[] arr={1,2,3};
        System.out.println(arr[5]);*/
    }
}
