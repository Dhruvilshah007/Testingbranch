package ImportantJavaConcepts.SerializationDesesializationConcept;

/*
Serialization in Java With Inheritance

When a parent class implements the Serializable interface, the child classes do not have to do so. This is a case of Serialization with Inheritance. Inheritance is when a child class extends a parent class and inherits it’s properties. Hence, the names - parent and child.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Child implements java.io.Serializable {

    public String stu_Name;

    Child(String stu_Name) {
        this.stu_Name = stu_Name;
    }
}

public class InheritanceSerializationEg extends  Child {

    public String Stu_addr;
    public int Stu_id;


    public InheritanceSerializationEg(String stu_Name,String stu_addr,int stu_id){
        super(stu_Name);
        this.Stu_id=stu_id;
        this.Stu_addr=stu_addr;

    }

    public static void main(String[] args) {
        InheritanceSerializationEg obj=new InheritanceSerializationEg("George","ABc xyz",10);

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

        //Since Student(InheritanceSerializationEg) extends Child which extends the Serializable interface there is no need for the Student class itself to extend this interface.

    }
}
