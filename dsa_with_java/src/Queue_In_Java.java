import java.util.Queue;
import java.util.LinkedList;
public class Queue_In_Java {
    public static void main(String[] args) {
        LinkedList<Integer>queue=new LinkedList<>();
         queue.add(43);
         queue.offer(324);
         queue.add(43);
         queue.offer(54);
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        queue.clear();
       // System.out.println(queue.element());//it will throw the excception no such element because the queue is empty
          System.out.println(queue.peek());//it will return null because it is empty
      //  System.out.println(queue.remove());  //it will throw the exception no such element exist in queue
          System.out.println(queue.poll());   //will return null





    }

}
