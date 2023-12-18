package JavaCollectionRiddhiDutta.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEg {

    public static void main(String[] args) {
        List<Integer> lk=new LinkedList<>();

        lk.add(1);
        lk.add(2);
        lk.add(3);

        ListIterator<Integer> iterator=lk.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //next() first gives current eleemnt and than goes to next position
        // return items[index++] means first return andthan increment
        //so here 1 should get printed but it prints 2, because previous() it first moves back and than returns value
        // return items[--index] means first decrement index and than return
        System.out.println(iterator.previous());


        //whenever in any DSA question if you require list or array go for arrayList



    }
}
