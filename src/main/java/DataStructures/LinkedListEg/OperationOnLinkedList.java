package DataStructures.LinkedListEg;

import java.util.LinkedList;

public class OperationOnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();


        //adding elements

        ll.add("Lionel");
        ll.add("is");
        ll.add(1,"Messi");
        ll.add("in");
        ll.add("the");
        ll.add("World.");


        System.out.println(ll);

        //changing elements

        ll.set(1,"the");
        System.out.println(ll);

        //remove element

/*        ll.removeFirst();
        ll.removeLast();
        ll.remove(1);*/


        //Iterating LL

        for (String str :
                ll) {
            System.out.println(str);
        }


        //convert LinkedList toarray

        LinkedList<Integer> list= new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);

        //size of LL

        System.out.println("The size of the linked list is: " + list.size());
        System.out.println("LinkedList: "+ list);
        Object[] a = list.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
            System.out.print(element+" ");

/*

        Disadvantages of using LinkedList in Java:

        ->Performance: LinkedList has a slower performance than ArrayList when it comes to accessing individual elements. This is because you need to traverse the list to reach the desired element, whereas with ArrayList, you can simply access the desired element using an index.
        ->Memory overhead: LinkedList requires more memory than ArrayList because each element requires additional memory for the links to its predecessor and successor elements.
*/





    }
}
