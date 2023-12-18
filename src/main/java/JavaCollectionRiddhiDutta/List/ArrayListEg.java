package JavaCollectionRiddhiDutta.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(2);

        System.out.println("element that got replaced="+aList.set(1,100));


        //copy arrayList
//        List<Integer> aList2=aList;
/*        List<Movie> newList = new ArrayList<Movie>(oldList);

        You should know that this creates a shallow copy of the original ArrayList, so all of the objects in both lists will be the same, but the two lists will be different objects.*/
        //List<Integer> aList2=new ArrayList<>(aList);
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(4);
        aList2.add(5);
        aList2.add(6);

        aList2.addAll(aList);

        System.out.println(aList2.indexOf(100));
        System.out.println(aList2.indexOf(10));
        //return -1 if not present

        System.out.println(aList.lastIndexOf(2));

        List<Integer> aList3=aList2.subList(1,4);
        //sublist is shallow copy and its copy of reference
        //here 4 index is not included 1 is included

        aList3.set(1,200);
        //so here magic is that 200 will be changed in both alist2(undelined arraylist) and alist3 as sublist just shows part-its shallow copy

        System.out.println(aList);
        System.out.println(aList2);
        System.out.println(aList3);

        /*
        Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing. The Java compiler applies unboxing when an object of a wrapper class is: Passed as a parameter to a method that expects a value of the corresponding primitive type.
         */

        //Convert arrayList to array
        //Integer only allowed int would throw error

        Integer [] arr=aList.toArray(new Integer[0]);
        //we passed new Integer[0]
        //3 conditions
        //1st same as size of arraylist than no problem
        //2nd size greater than array list--remainig part is null
        //3rd size less than array list--than newarray will be created of exactly same size as arrayList,we don't need to bother it will handle,
        for (int x :arr) {
            System.out.println(x);
        }




    }
}
