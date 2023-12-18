package TeluskoJava2023ExceptionConcepts;


class DhruvilException extends RuntimeException{

    //class DhruvilException extends Exception{  both Exception and RuntimeException can be extended
    public DhruvilException(String str){

        //passing same message to Druvil exception so it will handle it and also pass str
        super(str);
    }
}
public class CustomException_81 {

    public static void main(String[] args) {


        int i=20;
        int j=0;


        try {
            j=18/i;
            if (j==0){
                //trying to throw error
                throw new DhruvilException("Dhruvil exception here");
            }
        }catch (DhruvilException e){
            j=18/1;
            System.out.println("Thats the default output-"+e);

            //Real life example If we are trying to connect with Primary database but we are not able to connect than we can use this and connect with Secondary/Backup(line 14) database

        }catch (IndexOutOfBoundsException e){
            System.out.println("Array Indx outof bound--"+e);
        }catch (Exception e){
            System.out.println("Something went wrong unknown exception--"+e);
        }

    }
}


//video-- https://www.youtube.com/watch?v=V_jVp6WdW0Y&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=81


/*



--Java provides a set of built-in exceptions that cover most of the common error scenarios in a program.
--there may be cases where we need to define our own exception class to represent an error specific to your program.

#1
How to create custom exception in java?

class MyException extends Exception{
   // this class is own exception class defined by according to our need
}

-- MyException is a custom exception class that extends the Exception class.
#2
Now we want to pass some message
-- we need a constructor that takes a String message, which is passed to the parent constructor using the super keyword.
e.g -

Note: we can add additional properties and methods to your custom exception class as needed, just like you would with any other Java class.

#3
As per need we can throw custom Exception

Important Notes:
-- we can create a custom exception by extending the Throwable class in Java
-- we can create a custom exception by extending the Exception class in Java
-- we can create a custom exception by extending  the Exception class or one of its subclasses, such as RuntimeException.

Recommended:
-- Generally recommended to create custom exceptions by extending the Exception class or one of its subclasses, such as RuntimeException.
This makes it easier to handle your exception in a specific way and ensures that it behaves like other exceptions in the Java platform.

-- it is not recommended create custom exception using Throwable, the Throwable class is typically used to create other types of exceptions,
such as errors and checked exceptions, rather than custom exceptions.
 */