package TeluskoJava2023ExceptionConcepts;

public class TryCatchBasics_77 {

    public static void main(String[] args) {

        int i=0;
        int j=0;

        try {
            j=18/i;
        }catch (Exception e){
            System.out.println("Error here is"+e);
        }

        //here even if exception is there program won't stop it will say bye
        //Note-Catch block will be executed only if there is exception or else it wont get executed

//        System.out.println(j);
        //stops here execution

        System.out.println(j);
        System.out.println("bye");

    }
}



//video--https://www.youtube.com/watch?v=osEjmECD8bI&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=77

/*

-- Exception handling is a mechanism in Java that allows developers to handle
and recover from errors and exceptional conditions that may occur during the execution of a program.
-- One way to handle exceptions in Java is by using the try-catch block.

General Syntax of try -catch to handle exception:
try {
    // code that may throw an exception
} catch (ExceptionType1 e1) {
    // code to handle the exception of type ExceptionType1
} catch (ExceptionType2 e2) {
    // code to handle the exception of type ExceptionType2
} finally {
    // optional block of code that is executed regardless of whether an exception was thrown or not
}

we will discussing about everything try, catch ,finally and ExceptionType one by one

-- statemtns of two types
 i)normal statements
 Normal Statements:
Normal statements are statements that do not require any special handling, and they are executed in a normal sequence.
e.g Variable declarations and assignments: These statements are used to declare and assign values to variables.

 ii)critical statements
Critical statements are statements that can cause an exception or error, and they require special handling.
Handle using :
throw statements: These statements are used to throw an exception.
try-catch statements: These statements are used to handle exceptions.
finally statements: These statements are used to specify a block of code that is always executed, whether an exception is thrown or not.







 */