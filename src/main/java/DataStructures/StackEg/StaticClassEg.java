package DataStructures.StackEg;

public class StaticClassEg {

    //In Java, a static class is a nested class that is declared with the static modifier. A static class can only access static members of its outer class, but it can be instantiated without creating an instance of the outer class.

    private static int count = 0;

    public static class MyStaticClass {
        private int id;

        public MyStaticClass() {
            this.id = ++count;
        }

        public void printId() {
            System.out.println("MyStaticClass id: " + this.id);
        }
    }

    public static void main(String[] args) {
        MyStaticClass static1 = new MyStaticClass();
        MyStaticClass static2 = new MyStaticClass();
        static1.printId(); // prints "MyStaticClass id: 1"
        static2.printId(); // prints "MyStaticClass id: 2"
    }

    /*

    Real time uses of static class in java

In Java, a static class is a class that has only static methods and fields, and cannot be instantiated. Here are some real-time use cases of static classes in Java:

Utility classes: A common use case of static classes in Java is to create utility classes that contain only static methods and are used to perform common operations across the application. For example, the java.util.Collections class is a static class that contains methods for performing various operations on collections such as sorting, searching, and shuffling.

Math functions: Another common use of static classes in Java is for defining math functions that are used across the application. For example, the java.lang.Math class is a static class that provides methods for performing mathematical operations such as trigonometric functions, exponential functions, and logarithmic functions.

Constants: Static classes are also useful for defining constants that are used throughout the application. For example, the java.awt.Color class is a static class that defines various colors as static constants that can be used in the application.

Singleton pattern: The singleton pattern is a design pattern that is used to ensure that only one instance of a class is created in the application. One way to implement the singleton pattern is to use a static class with a private constructor and a static instance variable that returns the single instance of the class.

Helper classes: Static classes are often used as helper classes to provide common functionality that is used across the application. For example, the java.text.NumberFormat class is a static class that provides methods for formatting and parsing numbers.

In summary, static classes in Java are useful for creating utility classes, defining math functions and constants, implementing the singleton pattern, and providing common functionality across the application as helper classes.
Advantages of Static Classes:

Memory Efficiency: Static classes are loaded into memory only once during the lifetime of the application, making them more memory-efficient than non-static classes.
Easy Access: Since static classes are loaded into memory before any object of the class is created, they can be easily accessed without creating an instance of the class.
Utility Classes: Static classes are particularly useful for creating utility classes that don’t need to be instantiated, such as Math class.
Global Accessibility: Static classes can be accessed globally, which means they can be accessed from anywhere in the application.

Disadvantages of Static Classes:

Difficult to Test: Since static classes cannot be instantiated, it can be difficult to test them using automated unit tests.
Tight Coupling: Static classes can lead to tight coupling between classes, which can make the code more difficult to maintain and modify.
Difficulty in Extension: Static classes cannot be extended or subclassed, which can limit the flexibility of the code.
Limited Flexibility: Static classes are limited in their flexibility compared to non-static classes, as they cannot implement interfaces or be used in polymorphic contexts.
It’s important to note that static classes should be used judiciously in Java, and only when their advantages outweigh their disadvantages.



     */
}
