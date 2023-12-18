package ImportantJavaConcepts.ComparableVsComparator;


/*
Comparator is a functional interface in Java that can be used to sort objects, and it is provided by the java.util package.

A functional interface is an interface that contains exactly one abstract method. It is also called Single Abstract Method (SAM) Interfaces.
But wait, this is what the Comparable interface does. Then why do we need the Comparator interface? If a class implements the Comparable interface, then it is aware of how to sort itself because the class itself has implemented the compareTo() method.

This is called default ordering. Comparator is used for custom ordering where the class is unaware of the ordering logic.
Comparator provides multiple sorting sequence (i.e.) sorting objects based on multiple data members. Example: SuperHero objects can be sorted based on multiple attributes like id, name and age.
 */


//WHEN TO USE WHAT
//what is comparator
//if you want to on which logic you want to sort elements you can use comparator
//
// what is comparable
//if you want to give power to class itself to compare itself or compare its object toitself we can use comparable

//        https://www.youtube.com/watch?v=ZA2oNhtNk3w


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    //by default sort work with Integer as Integer class  implements Comparable<Integer>,

    public Student(int age,String name) {
        this.age = age;
        this.name=name;
    }


    //to print object as it is
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
//        return this.age-that.age;
        if(this.age>that.age){
            return 1;
        }else{
            return -1;
        }
    }

}

//we can make many comparatorobject like this and have ourown logic for it
//can have obj1=for length based string obj2=2nd character based sort etc different objects different logics

//in comparable we can implement onlyone logic at a time because of overridding one function Tocompare()
//but in it also with if and else condition we can have nested if else condition like
//for eg - if both age are same than compare with name , if name also same compare with id if elif else....
public class ComparatorEg {
    public static void main(String[] args) {



       /* Comparator<Student> com=new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                if(s1.age>s2.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        };*/

        //using lambda expression

        Comparator<Student> com=(s1, s2) ->s1.age>s2.age?1:-1;


       /* Comparator<Student> com=(s1,s2) ->{
            return s1.age>s2.age?1:-1;
        };*/
/*
            if(s1.age>s2.age){
                    return 1;
                }else{
                    return -1;
              }*/


        List<Student> studs=new ArrayList<>();

        studs.add(new Student(21,"navin"));
        studs.add(new Student(12,"john"));
        studs.add(new Student(18,"paru;"));
        studs.add(new Student(20,"kiran"));


        Collections.sort(studs);
        for (Student s:studs){
            System.out.println(s);
        }




/*
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

               if(o1%10>o2%10){
                   return 1;
               }else{
                   return -1;
               }
            }
        };

        List<Integer> nums=new ArrayList<>();

        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums,com);

        System.out.println(nums);*/


        //what if I want to sort below by last digit of number
        //so ans would be [31,72,43,29]
   /*     List<Integer> nums=new ArrayList<>();

        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
         Collections.sort(nums);



        System.out.println(nums);*/

    }
}
