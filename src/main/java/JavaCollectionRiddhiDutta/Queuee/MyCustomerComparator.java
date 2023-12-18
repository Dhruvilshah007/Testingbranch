package JavaCollectionRiddhiDutta.Queuee;

import java.util.Comparator;

public class MyCustomerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("MyCustomerComparator compare() is called");
        return o2-o1;
        //as descending order
    }
}
