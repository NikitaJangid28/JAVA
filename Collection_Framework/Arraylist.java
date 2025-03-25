import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist{
    public static void main(String[] args) {
        /*List<Integer> list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); // It will be added to the end of the list
        System.out.println(list);

        list.add(1,50); // This will add 50 on 1 index
        System.out.println(list);

        List<Integer> newlist =new ArrayList<>(); // Creating new list
        newlist.add(150);
        newlist.add(160);

        list.addAll(newlist); // this will add all new elements of newlist to the list 
        System.out.println(list);

        System.out.println(list.get(1)); // to get the element according to index
        */

        // Removing elements in Array list
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        System.out.println(list);
        System.out.println(list.get(4));

        /*list.remove(1); // this will remove the elements from the list using index
        System.out.println(list);

        list.remove(Integer.valueOf(30)); // This will remove the specific element from the list
        System.out.println(list);

        list.clear(); // It will remove all the elements from list  but did not delete the array
        System.out.println(list);*/

        /*// Updating list
        list.set(0,45); // It will change the element on a specific index
        System.out.println(list);

        // check if the value exists in the list or not and it will return the output in boolean
        System.out.println(list.contains(50));*/


        // Iterating in list
        for (int i=0; i<list.size();i++){
            System.out.println("The element is " +list.get(i));
        }

        for(Integer element: list){
            System.out.println("foreach element is " +element);
        }

        // Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " +it.next());
        }

    }
}