//this is a combination of hashset and Linked list here insertion order is maintain
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class Linked_Hashset {
    public static void main(String[] args) {
        LinkedHashSet<Object>l1=new LinkedHashSet<>();
        l1.add(100);
        l1.add(220);
        l1.add(89);
        ArrayList<String>Ar=new ArrayList<>();
        System.out.println(l1);
        Ar.add("Hii");
        Ar.add("I");
        Ar.add("Am");
        Ar.add("From ArrayList");
        l1.addAll(Ar);
        System.out.println("this is after adding the Arraylist into the LinkedHashset: "+l1);
        l1.remove("Hii");
        System.out.println(l1);
        
    }
}
