
import java.util.Arrays;
import java.util.LinkedList;

public class Learn {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20); // used to add item at last
        list.addLast(30);
        list.addFirst(2);  // used to add item at first
        list.removeLast();  // removes last item

        System.out.println(list.contains(100)); // used to check if value is there or not
        System.out.println(list.indexOf(20));  // used to provide index of the item.
        System.out.println(list.size());  // tells how many elements are present in the array
        var array = list.toArray();
        System.out.println(Arrays.toString(array)); // convert Linkedlist to Array

        // System.out.println(list);
    }
}
