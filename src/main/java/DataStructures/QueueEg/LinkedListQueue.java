package DataStructures.QueueEg;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String args[])
    {
        /*
        2. LinkedList: LinkedList is a class which is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues. Let’s see how to create a queue object using this class.
         */



        // Creating empty LinkedList
        Queue<Integer> ll
                = new LinkedList<Integer>();

        // Adding items to the ll
        // using add()
        ll.add(10);
        ll.add(20);
        ll.add(15);

        // Printing the top element of
        // the LinkedList
        System.out.println(ll.peek());

        // Printing the top element and removing it
        // from the LinkedList container
        System.out.println(ll.poll());

        // Printing the top element again
        System.out.println(ll.peek());
    }
}
