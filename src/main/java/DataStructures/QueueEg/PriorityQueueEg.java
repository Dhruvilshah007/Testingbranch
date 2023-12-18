package DataStructures.QueueEg;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEg {

    /*
    1. PriorityQueue: PriorityQueue class which is implemented in the collection framework provides us a way to process the objects based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play. Let’s see how to create a queue object using this class.
     */

    public static void main(String[] args) {
        Queue<Integer> pQueue=new PriorityQueue<Integer>();

//        Queue<Integer> pQueue=new PriorityQueue<>();--This is also same as above no change in it.

        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);

        System.out.println(pQueue);

         // Printing the top element and removing it
        System.out.println(pQueue.poll());
        System.out.println(pQueue);


        //peek pritns top element
        System.out.println(pQueue.peek());


    }
}
