package OopsConcepts.PolymorphismBasics;

/*
Polymorphism

Polymorphism is an important OOP concept; it means the ability to take many forms. For Example, an operation exhibits different behavior in different situations. The behavior depends on the type of data used in operation. For Example, in the operation of addition, the operation generates a sum for two numbers. If the operands are strings, then a third-string is produced by the operation by concatenation.

The figure below demonstrates that a single function name can be used to handle the different numbers and different types of arguments.
In polymorphism, objects having different internal structures can share the same external interface; it means that a class of operation may be accessed in the same manner even though actions with each operation may differ. Inheritance extensively uses the concept of polymorphism.

Polymorphism can be achieved in two ways:

Method Overloading(compile-time polymorphism)

It is possible to create methods with the same name but different parameter lists and different definitions. This is called method overloading. Method overloading is required when objects are required to perform similar tasks but using different input parameters. When we call a method in an object, Java matches up the method name first and then the number and type of parameters to decide which definition to execute.
 */


//same method name different paramteers
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Other overloaded methods for different data types and argument combinations

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);           // Calls the int add(int a, int b) method
        double sum2 = calculator.add(3.14, 2.71);   // Calls the double add(double a, double b) method
        int sum3 = calculator.add(1, 2, 3);         // Calls the int add(int a, int b, int c) method

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}}

/*
Dynamic Binding

Binding is the process of linking a procedure call to the code to be executed in response to the call. It means that the code associated with the given procedure call is not known until the time of the call at runtime. It is associated with inheritance and polymorphism.

Message Communication

Objects communicate with each other in OOPs The process of programming in case of OOP consists of the following:

    Creating classes defining objects and their behavior.
    Creating objects
    Establishing communication between objects.

 */