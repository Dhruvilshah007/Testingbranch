package ImportantJavaConcepts.SerializationDesesializationConcept;


import java.io.*;

/*
Serialization in Java With Static data member

Static data members are volatile to change during the serialization to deserialization process. Static means the data member is the only copy of the class and any change made to it will be felt throughout the program.

In other words, it belongs to the whole class. Consider below code where x is a static variable:
 */
public class SerializationWithStaticdatamember implements java.io.Serializable {

    static int x=50;

    public static void main(String[] args) {
        SerializationWithStaticdatamember s=new SerializationWithStaticdatamember();
        System.out.println("Value before Serialization ="+x);

        try{

            //serialization starts
            FileOutputStream fos=new FileOutputStream("demo.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();

            //serialization completed
            //static member value change
            x=48;
            fos.close();
            System.out.println("Object serialized");

            // Deserialization starts

            FileInputStream fis=new FileInputStream("demo.txt");
            ObjectInputStream objectInputStreamStream=new ObjectInputStream(fis);


            s = (SerializationWithStaticdatamember) objectInputStreamStream.readObject();
            objectInputStreamStream.close();
            fis.close();

            // Value of static member not revived
            System.out.println("Value after serialization: " + x);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (Exception e) {
            System.out.println("Class not found");
            e.printStackTrace();
            return;
        }
    }

    /* OUTPUT
    Value before serialization: 50
    Object serialized
    Value after serialization: 48
     */
    /*
    Explanation:

    In the above code, class has a static member of type int, with the value 50, when an object of this class was serialized. After this object was serialized, the value of the static member is changed to 48 by the program.

    When this object is deserialized, the value of static member is not restored to its original value of 50 which was the value when the object was serialized, because the static member belong to its class and not the object.

   IMP- Hence, the process of serialization and deserialization only works on the object of a class and it doesn't affect a static member of a class, and therefore, when object was deserialized, the value of static member is found to be 48 and not 50.

     */

    /*
    Conclusion

    Serialization is the mechanism of converting the state of an object into a byte - stream and Deserialization is the mechanism of converting a byte-stream again into an object.

    We perform serialization in Java using the writeObject(Objet ob) method and deserialization is performed using the readObject() method.

    We use the serialVersionUID attribute to remember versions of a Serializable class to verify that a loaded class and the serialized object are compatible.

    If the parent class implement java.io.Serializable, its child objects need not implement java.io.Serializable to be serializable.

    If a class contains an object of another non-serializable class as its data member, then it cannot be serialized.
    Serialization does not affect the static members of a class.

    https://www.scaler.com/topics/java/serialization-in-java/

     */

}
