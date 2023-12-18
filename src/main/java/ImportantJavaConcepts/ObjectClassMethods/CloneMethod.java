package ImportantJavaConcepts.ObjectClassMethods;

public class CloneMethod implements Cloneable{


    //declaring variables
    String name;
    int age;



    public static void main(String[] args) {

        CloneMethod obj=new CloneMethod();

        obj.name="dhruvil";
        obj.age=23;


        System.out.println(obj.name);
        System.out.println(obj.age);

        //now we will try to create clone

        try {
            CloneMethod obj2= (CloneMethod) obj.clone();

            System.out.println(obj2.name);
            System.out.println(obj2.age);
        } catch (CloneNotSupportedException e) {
            //throw new RuntimeException(e);
            System.out.println(e);

            //try catch is compulsory or throws CloneNotSupportedException :
        }
        /*
        Explanation
In the above code, we have cloned an object and then printed its value. We have made the Main class implement the Cloneable interface as, if we don't do it it will throw an exception of CloneNotSupportedException. We first created an object obj1 and then we cloned it using the clone() method. Then we printed both the objects and hence it gets verified that both the objects are the same.

Note: A beginner can skip the upcoming sections.
         */



    }
}

/*
clone()

The clone() method is used to create an exact copy of this object. It creates a new object and copies all the data of the this object to the new object.
 */