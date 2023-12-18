package DataStructures.QueueEg;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleBasics {
    public static void main(String[] args) {

        Queue<String> queue=new LinkedList<>();

        queue.add("Dhruvil");
        queue.add("Raj");
        queue.add("Mahesh");

        System.out.println("Queue is: "+queue);

        String frontElement=queue.remove();
        System.out.println("First element: "+frontElement);

        System.out.println("Updated Queue is: "+queue);

        queue.add("Kamlesh");

        //peek() function in Java is used to get the reference of the element at the top of the stack.Means which is added at last
//        Stack Last in first out(rightmost)
        // Queue FIFO(First in first out)
        System.out.println("Updated Queue after adding kamlesh is: "+queue);
        String peekedElement= queue.peek();
        System.out.println("Peeked Element is:" + peekedElement);










    }
}
