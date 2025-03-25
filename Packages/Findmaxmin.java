// Create a package in which there is a  function which find max and min value from the array but array length 
//is decided by the user only?
package arrayutils;

import java.util.*;

public class Findmaxmin {

    public void Max_min(int[]arr){
        
        if(arr.length==0){
            System.out.println("Array is empty");
        }
        int  min =arr[0], max=arr[0];
        for(int num :arr){
            if(num < min) min=num;
            if(num >max) max=num;
        }
        System.out.println("Array : " +Arrays.toString(arr));
        System.out.println("Minimum Number : " +min);
        System.out.println("Maximum Number : " +max);
    }
}
