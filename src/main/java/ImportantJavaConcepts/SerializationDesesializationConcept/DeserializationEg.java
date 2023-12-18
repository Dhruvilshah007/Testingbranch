package ImportantJavaConcepts.SerializationDesesializationConcept;

import java.io.*;

public class DeserializationEg {

    String name;
    int id;

    public static void main(String[] args) {
        SerializationEg obj=new SerializationEg();

        obj.name="Dds";
        obj.id=3;
        DeserializationEg obj2;


        try {
            FileOutputStream fos=new FileOutputStream("demo2.txt");

            ObjectOutputStream out=new ObjectOutputStream(fos);
            out.writeObject(obj);

            fos.close();
            out.close();

            // Serialization complete
            System.out.println("object serialized");

            // Deserialization process

            FileInputStream fileIn = new FileInputStream("demo2.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //Deserialization
            obj2= (DeserializationEg) in.readObject();
            in.close();
            fileIn.close();

            System.out.println(obj2.id);
            System.out.println(obj2.name);

        } catch (IOException i) {
          i.printStackTrace();
        }catch (Exception e) {
            System.out.println("Class not found");
            e.printStackTrace();
            return;
        }


    }
}

/*
While Serialization the writeObject() method is used. Whereas, in Deserialization the readObject() method is used. Also, for an object to be made serializable it is absolutely mandatory for the object’s class to implement the Serializable interface.
 */