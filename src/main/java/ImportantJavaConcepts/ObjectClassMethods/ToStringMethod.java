package ImportantJavaConcepts.ObjectClassMethods;

public class ToStringMethod {

    int car_no;

    ToStringMethod(int car_no){
        this.car_no=car_no;

    }

    @Override
    public String toString() {
        return car_no + " ";

    }

    public static void main(String[] args) {
        ToStringMethod obj=new ToStringMethod(16);


        // Below two statements are equivalent
        System.out.println(obj.toString());
        System.out.println(obj);

        //Explanation
        //Here we can see that when we tried to print the string representation of car_no using toString() method and print statement, it printed its hexadecimal representation. It was not the desired result. So, here we have to override the toString() method so that we get the exact value as a string that the variable has stored.
        //
        //This is how we can do it.

      /*  Explanation
        Here, we can see that after overriding, we get the desired output.*/




    }
}




//Scalar blog link - https://www.scaler.com/topics/object-class-in-java/


/*

toString() method--Used to convert object to string

As the name suggests, it returns a string representation of an object. It is used to convert an Object "to String".

As each class is a sub-class of the Object class in Java. So the toString() method gets inherited by the other classes from the Object class.

If we try to print the object of any class, then the JVM internally invokes the toString() method.

It is a good practice to override the toString() in an inherited class as it'll aid in a better string representation of the object. If we do not override it, it will give the hexadecimal representation of the object.

 */