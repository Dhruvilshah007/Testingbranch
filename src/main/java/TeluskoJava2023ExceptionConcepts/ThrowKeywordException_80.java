package TeluskoJava2023ExceptionConcepts;

public class ThrowKeywordException_80 {

    public static void main(String[] args) {

        int i=20;
        int j=0;


        try {
            j=18/i;
            if (j==0){
                //trying to throw error
                throw new ArithmeticException("I dont want to print Zero");
            }
        }catch (ArithmeticException e){
            j=18/1;
            System.out.println("Thats the default output-"+e);

            //Real life example If we are trying to connect with Primary database but we are not able to connect tahn we can use this and connect with Secondary/Backup(line 14) database

        }catch (IndexOutOfBoundsException e){
            System.out.println("Array Indx outof bound--"+e);
        }catch (Exception e){
            System.out.println("Something went wrong unknown exception--"+e);
        }

        //last Exception shouldbe at bottom always as it handles all exception

        System.out.println(j);
        System.out.println("bye");

    }
}

//video --https://www.youtube.com/watch?v=kAOYeVYtukY&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=80


/*
#1
-- throw keyword in Java is used to explicitly throw an exception.
When an exception is thrown using the throw keyword, the execution of the current method is stopped.

syntax-
throw new NullPointerException("Object is null");

#2
-- throw keyword is used to throw exceptions, not to catch them. To catch exceptions, you need to use a try-catch block.
-- if you do not use try-catch then the control is passed, where the method is called.
-- when you want to pass message to an exception
then you should use the parametrized constructor instead non parameterized constructor
 *//