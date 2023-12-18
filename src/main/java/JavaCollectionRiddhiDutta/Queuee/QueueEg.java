package JavaCollectionRiddhiDutta.Queuee;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEg {

    public static void main(String[] args) {

        //Queue is same like List both are interface and we cannot instantiate interface so on Rightside we will have its implementation class
        //FIFO queue
        Queue<Integer> q=new LinkedList<>();


        // add() will throw an IllegalStateException if no space is currently available in the Queue, otherwise add method will return true. offer() method will return false if the element cannot be inserted due to capacity restrictions.
        q.offer(1);
        q.offer(2);

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println(q.peek());

        //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(q.poll());

        System.out.println(q.peek());

//        System.out.println(q);[2]

        //is empty ,ethod is of collection but we can use it because queue extends collections interface
        //true if empty false if not empty
        System.out.println(q.isEmpty());





    }
}
