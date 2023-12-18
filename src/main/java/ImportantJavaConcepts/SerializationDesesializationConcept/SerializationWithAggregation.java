package ImportantJavaConcepts.SerializationDesesializationConcept;

/*
Serialization in Java With Aggregation

If a class Student has an object of type Child and if class Student were to implement the Serializable interface and not B then Java would throw a NotSerializableException. Let’s see in code:
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Child1{
    public String name;
    Child1(String name){
        this.name=name;
    }

}

//Non-serializable  class
public class SerializationWithAggregation implements java.io.Serializable{

    String addr;
    int id;
    Child1 child;

    public SerializationWithAggregation(String addr,int id){
        this.addr=addr;
        this.id=id;

    }

    public static void main(String[] args) {
        SerializationWithAggregation obj=new SerializationWithAggregation("George",10);

        try{
            FileOutputStream fos=new FileOutputStream("demo.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully");
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    //The above code snippet would throw a NotSerializableException when an object of class Student(SerializationWithAggregation) is serialized. Class Student is said to have a relationship with class Child. This is called Aggregation (HAS-A Relationship).

}
