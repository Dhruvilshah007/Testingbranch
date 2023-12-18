package JavaCollectionRiddhiDutta.Queuee;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueEg {

    public static void main(String[] args) {

        //what if we want top2 elements of bottom2?

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        //offer and add both can be used
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);

        //top 2 elements
        List<Integer> bottom2=new ArrayList<>();
        int index=0;
        while(pq.isEmpty()){
            if(index==2){
                break;
            }
            bottom2.add(pq.poll());
            index++;

        }
/*        System.out.println(bottom2);
        System.out.println(pq);*/

        //ordering class is having is called Natural Ordering(comparable)
        //ordering passing to Priority Queue  is called Total Ordering(comparator)

        //total ordering has more precendence than natural ordering

        //what if we want top 2 elements ?

/*        PriorityQueue<Integer> pq2=new PriorityQueue<>(new MyCustomerComparator());

        //offer and add both can be used
        pq2.offer(1);
        pq2.offer(2);
        pq2.offer(0);
        pq2.offer(100);

        //top 2 elements
        List<Integer> bottom23=new ArrayList<>();
        int index2=0;
        while(!pq2.isEmpty()){
            if(index2==2){
                break;
            }
            bottom23.add(pq2.poll());
            index2++;

        }
        System.out.println(bottom23);
        System.out.println(pq2);*/

        //doing same with lambda expression

/*
        PriorityQueue<Integer> pq2=new PriorityQueue<>((a,b)->b-a);

        //offer and add both can be used
        pq2.offer(1);
        pq2.offer(2);
        pq2.offer(0);
        pq2.offer(100);

        //top 2 elements
        List<Integer> bottom23=new ArrayList<>();
        int index2=0;
        while(!pq2.isEmpty()){
            if(index2==2){
                break;
            }
            bottom23.add(pq2.poll());
            index2++;

        }
        System.out.println(bottom23);
        System.out.println(pq2);
*/


//        ---------------------------------------------

      /*  List<StudentMarks> stMarks=new ArrayList<>();
        stMarks.add(new StudentMarks(70,80));
        stMarks.add(new StudentMarks(38,10));
        stMarks.add(new StudentMarks(100,38));
        stMarks.add(new StudentMarks(40,88));
        stMarks.add(new StudentMarks(97,19));

        //by adding stMarks in () all content of ArrayList will be in PQ
        PriorityQueue<StudentMarks> spq=new PriorityQueue<>(stMarks);*/

        //We can add elements in pq by below one by one
//        spq.add(new StudentMarks(60,80));
        //we can traverse ArrayList and add one by one also

        //Now we will do that thing in one line

      /*  List<StudentMarks> top3=new ArrayList<>();
        index=0;
        while(!spq.isEmpty()){
            if(index==3){
                break;
            }
            top3.add(spq.poll());
            index++;
        }

        System.out.println(top3);*/
        //error as we are using custom class



        //Doing same with comparator

        List<StudentMarks> stMarks=new ArrayList<>();
        stMarks.add(new StudentMarks(70,80));
        stMarks.add(new StudentMarks(38,10));
        stMarks.add(new StudentMarks(100,38));
        stMarks.add(new StudentMarks(40,88));
        stMarks.add(new StudentMarks(97,19));

        //by adding stMarks in () all content of ArrayList will be in PQ
        PriorityQueue<StudentMarks> spq=new PriorityQueue<>((s1,s2)->{
            System.out.println("comparator compareTo() is called");
            return s2.getPhysics()-s1.getPhysics();
        });

        for (StudentMarks sm: stMarks) {
            spq.add(sm);
        }

        //We can add elements in pq by below one by one
//        spq.add(new StudentMarks(60,80));
        //we can traverse ArrayList and add one by one also

        //Now we will do that thing in one line

        List<StudentMarks> top3=new ArrayList<>();
        index=0;
        while(!spq.isEmpty()){
            if(index==3){
                break;
            }
            top3.add(spq.poll());
            index++;
        }

        System.out.println(top3);
        //comparator has more priority than comparable

        //1:50














    }
}
