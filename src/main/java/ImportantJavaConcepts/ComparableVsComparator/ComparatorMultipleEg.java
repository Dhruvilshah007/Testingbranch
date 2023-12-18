package ImportantJavaConcepts.ComparableVsComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    int age;
    String name;
    String surname;

    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
public class ComparatorMultipleEg {

    public static void main(String[] args) {

        Comparator<Person> comp1=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               if(o1.age==o2.age){
                   //now compare here by first name
                   if(o1.name.charAt(0)>o2.name.charAt(0)){
                       return 1;
                   }else{
                       return -1;
                   }

               }else if(o1.age>o2.age){
                   //swap
                   return 1;
               }
               else{
                   //not swap
                   return -1;
               }
            }
        };

        Comparator<Person> comp2=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //another object of comparator  to compare with surname first  character
                if(o1.surname.charAt(0)>o2.surname.charAt(0)){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        List<Person> list1=new ArrayList<>();

        list1.add(new Person(21,"Dhruvil","Shah"));
        list1.add(new Person(21,"Aniket","Shah"));
        list1.add(new Person(10,"Yash","Patel"));

        Collections.sort(list1,comp1);

        //to compare by surname
//        Collections.sort(list1,comp2);

     //   System.out.println(list1);

        for(Person p:list1){
            System.out.println(p);
        }





    }
}
