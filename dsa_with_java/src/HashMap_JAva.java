import java.util.HashMap;

 class HashMap_Java {
    public static void main(String[] args) {
        HashMap<String, Integer> m1 = new HashMap<>();

        m1.put("BCA1", 20000);
        m1.put("BCA2", 22000);
        m1.put(null, 23000); // HashMap allows one null key
        m1.put(null,28000); //now this will overwrite the previous value of null key
        m1.put("BCA1",27000);//this will overwrite the value of BCA1 key
        m1.put("BCA3",30000);
        System.out.println("Value of 'BCA1': " + m1.get("BCA1")); // ✅ Output: 27000
        System.out.println("Value of 20000 (wrong key): " + m1.get("BCA4")); // ❌ Wrong key, Output: null
        System.out.println("Value of null key: " + m1.get(null)); // ✅ Output: 28000
        m1.remove("BCA3");
        System.out.println(m1.get("BCA3"));//will show null just because i had remove the value of BCA3
        System.out.println(m1.containsKey("BCA2"));//it will return true because it contains key BCA2
        System.out.println(m1.containsKey("BCA6"));//it will return false
        System.out.println(m1.containsValue(20000));//it will return false because it was replaced by 27000
        System.out.println(m1.containsValue(28000));//it will return true
        HashMap<String,Integer>m2=new HashMap<>();
        m2.put("BBA1",18000);
        m2.put("BBA2",18000);
        m2.put("BBA3",20000);
        m2.put("BBA4",null);
        m1.putAll(m2);
        System.out.println(m1);
        System.out.println(m1.isEmpty());
        System.out.println(m1.size());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.entrySet());

    }
}
