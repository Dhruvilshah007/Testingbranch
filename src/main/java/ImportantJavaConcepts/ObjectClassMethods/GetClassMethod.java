package ImportantJavaConcepts.ObjectClassMethods;

public class GetClassMethod {

    public static void main(String[] args) {

        Object s=new String("hii");
        Object i=new Integer(19);

        Class c=s.getClass();
        Class d=i.getClass();

        System.out.println("Class of object s is"+ c.getName());

        System.out.println("Class of object i is"+ d.getName());

        /*
        Explanation
In the above example, we fetched the runtime classes of a string and an integer. For the string, the class was java.lang.String whereas, for the integer, the class was java.lang.Integer.
         */


    }
}


/*
It is used to return the class object of this object. Also, it fetches the actual runtime class of the object on which the method is called. This is also a native method. It can be used to get the metadata of the this class. Metadata of a class includes the class name, fields name, methods, constructor, etc.
 */