import java.util.Hashtable;
public class HashTable_Java {
    public static void main(String[] args) {
        Hashtable<String,Integer>table=new Hashtable<>();
        table.put("BBA1",32);
        table.put("BBA2",44);
        table.put("BBA3",434);
        table.put("BBA4",434);
        System.out.println(table);
        System.out.println(table.keySet());
        System.out.println(table.values());
        System.out.println(table.contains(434));
        System.out.println(table.isEmpty());
    }
}
