package OopsConcepts.AbstractionBasics;


/*
Data Abstraction and Encapsulation

The wrapping up of the data and methods into the single unit is known as encapsulation. The data is accessible only to those methods, which are wrapped in the class, and not to the outside world. This insulation of data from the direct access of the program is called data hiding. Encapsulation of the object makes it possible for the objects to be treated like ‘black boxes’ that perform a specific task without any concern for internal implementation.

Abstraction is the act of reducing programming complexity by representing essential features without including the background explanations or details. Classes are the concept of abstraction and are defined as the list of abstract attributes such as size, weight, cost, and methods that operate on these attributes. Classes wrap or encapsulate all the essential properties of the objects that are to be created.

Abstract classes and Abstract methods:

    An abstract class is a class with an abstract keyword.
    An abstract method is a method declared without a method body.
    An abstract class may not have all the abstract methods. Some methods are concrete.
    A method defined abstract must have its implementation in the derived class, thus making method overriding compulsory. Making a subclass abstract avoids overriding.
    Classes that contain abstract method(s) must be declared with abstract keyword.
    The object for an abstract class cannot be instantiated with the new operator.
    An abstract class can have parameterized constructors.

Ways to achieve abstraction:

    Using abstract keyword
    Using interfaces

    Abstraction is a technique of hiding unnecessary details from the user.
    The user is only given access to the details that are relevant. Vehicle operations or ATM operations are classic examples of abstractions in the real world.


 */
abstract class Car {
    Car(){
        System.out.println("Car is built");
    }
    abstract void drive();
    void gearChange(){
        System.out.println("Gear is changed");
    }
}
class Tesla extends Car{
    void drive(){
        System.out.println("Drive Safely");
    }
}

class Abstraction{
    public static void main(String[] args) {
        Car obj=new Tesla();
        obj.drive();
        obj.gearChange();
    }
}