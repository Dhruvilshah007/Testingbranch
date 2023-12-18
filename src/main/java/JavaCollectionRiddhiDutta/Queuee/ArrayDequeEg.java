package JavaCollectionRiddhiDutta.Queuee;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg {

    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();


        //here we are useing dequeue as Stack as FIFO
        //add in first pointer
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);

        System.out.println(dq);

        //to remove elements will follow FIFO approach to remove,so 3 will be removed

        dq.pollFirst();
        System.out.println(dq);


//        ----------------------------------------------------------

        //here we are useing dequeue as queue as FIFO
        Deque<Integer> dq2=new ArrayDeque<>();

        dq2.offerLast(1);
        dq2.offerLast(2);
        dq2.offerLast(3);

        System.out.println(dq2);

        //to remove elements will follow FIFO approach to remove,so 3 will be removed

        dq2.pollFirst();
        System.out.println(dq2);

        //also can be used as double ended queue

    }
}
