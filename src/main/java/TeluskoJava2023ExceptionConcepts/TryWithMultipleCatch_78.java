package TeluskoJava2023ExceptionConcepts;

public class TryWithMultipleCatch_78 {

    public static void main(String[] args) {

        int i=2;
        int j=0;

        int nums[]=new int[5];

        String str=null;


        try {
            j=18/i;

            System.out.println(nums[1]);
            //System.out.println(nums[5]);
            System.out.println(str.length());
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero--"+e);
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

//hierarchiay of exception

/*
Throwable class
Exception Class
RuntimeException
ArithmeticException  class,IndexOutOfBoundsException Exception


*/




//video--https://www.youtube.com/watch?v=Ky8P70QlKNU&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=78

/*

In this lecture we are discussing about try with multiple catch:
 --In Java, the try-catch block is used to handle exceptions. It allows you to write code that handles exceptions that may be thrown during the execution of your program.
 we can also handle different types of exceptions with multiple catch blocks.

 -- suppose we write few lines of code and we donot know which line can generate exception but
 we know donot which types of exception can be generated. In this case we can use try with multiple catch
 e.g

 #
Handling parents and child Exception both
-- when catching both child and parent exceptions in a try-catch block, it is generally recommended to catch the child
   exceptions before the parent exception.

-- The reason for this is that if you catch the parent exception before the child exception, the catch block for the parent exception will also catch any child exceptions that are subclasses of the parent exception.
This can make it more difficult to handle the child exceptions separately.

-- this will give compile time error i.e error: exception ArithmeticException has already been caught by Exception class
 */