import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Object> hs=new HashSet<>(); //default capacity is 16 ND load factor is 0.75
        hs.add(100);
        hs.add(200);
        hs.add(323);

        LinkedList<Integer>l1=new LinkedList<>();
        l1.add(200);
        l1.add(323);
        l1.add(5454);
        l1.add(32345);
        hs.addAll(l1);//since unique value is only add to the hashset
        System.out.println("After union:"+hs);
        hs.remove(32345);
        System.out.println("After single removal of value: "+hs);
        hs.removeAll(l1); //so this method is use in special case where we want to remove some specific collection's elements
        System.out.println("This is after removal of l1:"+hs);
        hs.clear(); //and this is use to removeall elements from the hashset
        System.out.println(hs);
    }
}
