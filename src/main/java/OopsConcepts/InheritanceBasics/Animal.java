package OopsConcepts.InheritanceBasics;


/*
Inheritance

Inheritance is the process by which objects of one class acquire some properties of objects of another class. Inheritance supports the concept of hierarchical classification. For Example, a bird Robin is part of the class, not a mammal, which is again a part of the class Animal. The principle behind this division is that each subclass shares common characteristics from the class from its parent class.

In OOP, the idea of inheritance provides the concept of reusability. It means that we can add additional features to parent class without modification; this is possible by deriving a new class from the parent class. The new class consists of the combined features from both the classes. In Java, the derived class is also known as the subclass.
Types of Inheritance

    Single

    Multiple-class Test extends Parent1, Parent2   (not supported in java,but can be done through interface)

    Multilevel--class Shape,
                class Rectangle extends Shape ,
                 class Cube extends Rectangle,
                 public class Tester{}

    Cube cube = new Cube();
      cube.display();
      cube.area();
      cube.volume();

    Hybrid -For example, there are four classes say A, B, C, and D. Assume that the class "A" and "B" extends the class "C". Also, another class, "D," extends the class "A". Here, the class "A" is a parent class for child class "D" and is also a child class for parent class "C". we can understand the example through pictorial representation.

    A extends C
    B extends C
    D extends A


 */

public class Animal {

    void eat(){
        System.out.println("Animal eating");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("Cat says meow..");

    }
}

class Dog extends Animal{
    void speak(){
        System.out.println("Dog says bark..");

    }
}

class Inheritance{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.speak();
        d.eat();
    }
}
