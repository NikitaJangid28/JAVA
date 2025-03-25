import arrayutils.Findmaxmin;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " +n+ "elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Findmaxmin f =new Findmaxmin();
        f.Max_min(arr);

        sc.close();
    }
}
