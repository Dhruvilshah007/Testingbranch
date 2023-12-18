package DataStructures.QueueEg;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueEg {

    /*
    3. PriorityBlockingQueue: It is to be noted that both the implementations, the PriorityQueue and LinkedList are not thread-safe. PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed. PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations.
          Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError. Let’s see how to create a queue object using this class.
     */
    public static void main(String args[])
    {
        // Creating empty priority
        // blocking queue
        Queue<Integer> pbq
                = new PriorityBlockingQueue<Integer>();

        // Adding items to the pbq
        // using add()
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        // Printing the top element of
        // the PriorityBlockingQueue
        System.out.println(pbq.peek());

        // Printing the top element and
        // removing it from the
        // PriorityBlockingQueue
        System.out.println(pbq.poll());

        // Printing the top element again
        System.out.println(pbq.peek());
    }

    /*
    Advantages of using the Queue interface in Java:

Order preservation: The Queue interface provides a way to store and retrieve elements in a specific order, following the first-in, first-out (FIFO) principle.

Flexibility: The Queue interface is a subtype of the Collection interface, which means that it can be used with many different data structures and algorithms, depending on the requirements of the application.

Thread–safety: Some implementations of the Queue interface, such as the java.util.concurrent.ConcurrentLinkedQueue class, are thread-safe, which means that they can be accessed by multiple threads simultaneously without causing conflicts.

Performance: The Queue interface provides efficient implementations for adding, removing, and inspecting elements, making it a useful tool for managing collections of elements in performance-critical applications.
Disadvantages of using the Queue interface in Java:

Limited functionality: The Queue interface is designed specifically for managing collections of elements in a specific order, which means that it may not be suitable for more complex data structures or algorithms.

Size restrictions: Some implementations of the Queue interface, such as the ArrayDeque class, have a fixed size, which means that they cannot grow beyond a certain number of elements.

Memory usage: Depending on the implementation, the Queue interface may require more memory than other data structures, especially if it needs to store additional information about the order of the elements.

Complexity: The Queue interface can be difficult to use and understand for novice programmers, especially if they are not familiar with the principles of data structures and algorithms.
     */
}
