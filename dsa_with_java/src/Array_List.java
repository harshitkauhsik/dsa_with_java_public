import java.util.*;



public class Array_List {
       static List<Integer> NumberArray=new ArrayList<>();//specified the type of arraylist it can store only that kind of data

    public static void main(String[] args) {
      //  Array_List l1=new Array_List();
        NumberArray.add(59); //insert element at the end of the list
        NumberArray.add(59);
        NumberArray.add(59);
        NumberArray.add(2,52);
        NumberArray.add(2,-32);
        Object arr[]=NumberArray.toArray();
        for(Object a1:arr)
            System.out.print(" Me : "+a1);
        List<Integer> NewList=new ArrayList<>(); //already specified the type
        NewList.add(-90);
        NewList.add(-723);
        Collections.sort(NumberArray);
        System.out.println("After sort: "+NumberArray);
        Collections.shuffle(NumberArray);
        System.out.println("After shuffle: "+NumberArray);

        NumberArray.addAll(NewList);// add a list's element at the end of another list
        NumberArray.set(2,-567);// add element at specific location
        System.out.println(NumberArray);// to get all elements from the list by object
        for(int i=0;i<NumberArray.size(); i++) //get the elements one by one
        {
            System.out.print(" "+NumberArray.get(i));
        }
        System.out.println();
        System.out.println( NumberArray.contains(59));//to check wether element exist or not
        System.out.println(NumberArray.get(4));//to get the value of specific index
        NumberArray.remove(2); //remove value of specific index
        System.out.println(NumberArray);
        System.out.println(NumberArray.isEmpty());
        NumberArray.remove(Integer.valueOf(68));//remove the value of similar
        System.out.println(NumberArray);
        NumberArray.clear(); //To clear the entire list element
        System.out.println(NumberArray);
        List l2=new ArrayList(); //Type not specified so that it can store any type of value
        l2.add(45);
        l2.add("Harshit");
        l2.add(-43.34345);
        System.out.println(l2);
        System.out.println("This is to string"+l2.toString());



    }
}
