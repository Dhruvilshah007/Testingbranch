package ImportantJavaConcepts.ComparableVsComparator;

import java.util.*;
public class ComparatorStringEg2{
    public static void main(String args[]){

        Comparator<String> som=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    //swap
                    return 1;
                }else{
                    //not swap
                    return  -1;
                }
            }
        };



        //Creating a List
        List<String> list=new ArrayList<>();
        //Adding elements in the List
        list.add("abc");
        list.add("Dhruvil");
        list.add("Technology");
        list.add("shah");

        //sort on basis of length of string
        Collections.sort(list,som);
        //Iterating the List element using for-each loop
        System.out.println(list);

    }
}
