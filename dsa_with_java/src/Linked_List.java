import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> StringList=new LinkedList<>();
        StringList.add("Hiii");
        StringList.add("I");
        StringList.add("am");
        StringList.addFirst("This");
        StringList.addLast("433");
        StringList.add("Harshit");
        System.out.println(StringList);
        StringList.set(0,"heyyyy");
        System.out.println(StringList);

        System.out.println("Size:"+StringList.size());
        System.out.println(StringList.isEmpty());
        System.out.println(StringList.contains("am"));
        StringList.clear();
        StringList.addFirst(String.valueOf(3223));
        StringList.addFirst(String.valueOf(4344));
        System.out.println(StringList);
        StringList.addLast(String.valueOf(22343));
        StringList.addLast(String.valueOf(32343));
        System.out.println("total size: "+StringList.size());
        System.out.println(StringList.getFirst());
        System.out.println(StringList.getLast());
        StringList.removeFirst();
        System.out.println(StringList);
        Iterator it=StringList.iterator(); //using iterator class
        while(it.hasNext()) //has next method
        {
            System.out.println("Using iterator");
            System.out.println(it.next());  //printing
        }
        StringList.removeLast();
       // StringList.remove(3);
        System.out.println(StringList);

       // StringList.clear();
        System.out.println(StringList);
        LinkedList<String> l1=new LinkedList<>();
         l1.add("THis ");
         l1.add("Is");
         l1.add("New");
         l1.add("List");
         StringList.addAll(l1);
        System.out.println("After adding");
        System.out.println(StringList);
        Collections.sort(StringList);
        System.out.println("After sorting: "+StringList);
        StringList.removeAll(l1);
        System.out.println("After remove"+StringList);


    }


}
