package DataStructures.LinkedListEg;

import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/linked-list-in-java/

        System.out.println("Linked List heree");


        //basicially in this wayist implemented
       // LinkedList ll = new LinkedList();

        LinkedList<String> ll=new LinkedList<String>();

        ll.add("Lionel");
        ll.add("Messi");
        ll.addLast("Lionel");
        ll.addFirst("The");
        ll.add("is Best");

        System.out.println(ll);

        ll.remove("The");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);



    }
}
