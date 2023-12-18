package ImportantJavaConcepts.SerializationDesesializationConcept;

import java.io.*;

public class TransientEg implements java.io.Serializable {

    public String stu_Name;
    transient String stu_Addr;
    public int stu_Id;

    public static void main(String[] args) {
        TransientEg s = new TransientEg();
        s.stu_Name = "George";
        s.stu_Addr = "ABC,XYZ";
        s.stu_Id = 1;
        try {
            FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s);
            out.close();
            fileOut.close();

            // Serialization complete
            System.out.println("Object serialized");

            FileInputStream fileIn = new FileInputStream("storeObject.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialization in process.
            s = (TransientEg) in.readObject();

            // Close input stream and the file.
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Class not found");
            e.printStackTrace();
            return;
        }
        // Print the values of deserialized object.
        System.out.println("Deserialized Student...");
        System.out.println("Name: " + s.stu_Name);
        System.out.println("Address: " + s.stu_Addr);
    }
}
/*
Explanation:

The last print statement will return null as stu_Addr is a transient variable and as such it will not get serialized and will lose its value.

Note:

Space is allocated to transient variables as these do not get converted to byte streams. This results in inefficient memory utilization. When a class gets serialized we are unable to use it till we convert it back from byte stream.
 */