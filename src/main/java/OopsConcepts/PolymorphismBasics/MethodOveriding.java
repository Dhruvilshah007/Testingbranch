package OopsConcepts.PolymorphismBasics;

/*
Method Overriding

A method defined in the superclass is inherited by its subclass and is used by the objects created by the subclass.
 However, there may be occasions when an object should respond to the same method but behave differently when that method is called,
  which means a method defined in the superclass is overridden. Overriding is achieved by defining a method in the subclass that has the same name, 
  the same arguments, and the same return type as a method in the superclass. So, when the method is called, the method defined in the subclass invoked and executed instead of the one in the superclass.
 */


//same method name different class and extends parent class
class Shape {
    // Other common attributes and methods for all shapes

    public double calculateArea() {
        return 0.0; // Default implementation for unknown shape (e.g., for the base class)
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);

        double area1 = shape1.calculateArea(); // Calls Circle's calculateArea()
        double area2 = shape2.calculateArea(); // Calls Rectangle's calculateArea()

        System.out.println("Area of Circle: " + area1);
        System.out.println("Area of Rectangle: " + area2);
    }
}
