package JavaCollectionRiddhiDutta.NeedOfIterators;

import java.util.Iterator;

public class CollectionsTest {

    public static void main(String[] args) {

        //java 1.7 need to privide Integer on both right and left side
        OurGenericList<Integer> list=new OurGenericList<>();

        list.add(1);
        list.add(2);
        list.add(3);




/*        for (int x:list) {
        }*/
        //SO here we are not able to iterate over list because
/*        private T[] items;
          private int size;*/
        //both of these fields are private
        //Soln1:Make this array fields and int as public
        //problem:It violates OOPs and encapsulation principle,we can change content of array from outside which is bad thing to do
       /* What if i want to change internal implemnetation of OurGenericList
            than we wont be able to use functonality properly.WHat if i want to change it into arraylist than we cannot use .get method*/
        //Solution:SO, comes into picture Iterable Interface

        Iterator<Integer> iterator= list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //we can also use forEach
        //both Iterator and for each will call hasNext() and next() method only

       /* for (int x : list) {
            System.out.println(x);
        }*/
        //so whenever we use foreach to traverse ArrayList or LinkedList this things happen


/*        Iterator and Iterable both interfaces sound similar and are often confusing. Any class that implements an Iterable interface, overrides the iterator() method present in the Iterable interface. This iterator() method calls an Iterator interface which then returns an iterator. This iterator is used to iterate over an object of that class. The Iterator interface has four methods namely next(), hasNext(), remove() and forEachRemaining().*/

        //One interface and extend other interface

//        for eg -collection extends Iterable
        //map is not implementing or extending collection so how we will iterate map is a question








    }
}
