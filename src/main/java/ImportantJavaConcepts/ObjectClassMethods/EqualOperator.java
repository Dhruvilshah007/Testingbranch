package ImportantJavaConcepts.ObjectClassMethods;


/*
equals method

1-It compares primitive datatype by value
2-Compares address of objects for all different class objects
3-For comparing String class also it compares location(address) and not value
   EG-
        String str1="dds";
        String str2="dds";
        String str3=new String("dds");

        System.out.println(str1==str2);   // true
        System.out.println(str1==str3);   // false

        System.out.println("Using equals");   here it compares first location, if not matches compares char by char value for only string class

        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.equals(str3));  // true

4-We can not  write custom our own == logic,as it is not overidable,its operator */


public class EqualOperator {

    public static void main(String[] args) {

        int n1=10;
        int n2=10;

        System.out.println(n1==n2);

    }
}

/*
In Java, we use the "==" operator to compare two variables of primitive data type and also compare objects. Just like equals() method, "==" also returns boolean output. Since "==" is an operator, it is not overrideable, and hence we avoid using it for comparing two objects. It can be used to compare two variables of int, char, byte, short, long, boolean, float and double types.

Let us look at an example of the same.
 */

/*
Explanation:

    Here we are defining five integers. For the first comparison, we can see that n1 is 10 and n2 is 20, so the result is false.
    For the second comparison, we can see that since n4 and n5 both are 20 we are getting true as the result.
    We have used the extra variables to show that == operator does not compare the memory locations.

 */

/*
Note:

        Using the "==" operator for comparing two strings is not illegal and hence it will not cause any errors.
        But since it compares the locations of the strings and thus, it will not give the correct/desired output.
*/

/*
"==" Operator	.equals() Method
"==" is an operator in Java and hence it is can not be overridden.	equals() is a method in Java and hence it can be overridden.
It is generally used to compare two variables of primitive data types but can be used to compare objects as well.	It is used to compare objects. It can not compare primitive data types.
It compares the data of the two variables, but in the case of objects, it compares the memory locations.	It compares the memory location of the objects. For the String objects, it compares them character by character as well if the memory location equality fails.
It takes O(1) time for comparison.	It takes O(1) time for normal objects and O(n) time for String objects.
It throws a compile time error if the two variables are not of the same data type.	It returns a "false" value if the objects are not of the same type.
 */

/*
Conclusion

    The equals() method in Java is used to compare two objects on the basis of their memory locations.
    == is a Java operator, generally used to compare primitive data types but can also be used to compare objects.
    == operator compares the data for primitive data types and addresses for objects.
    equals() method can be used to compare strings character by character, for strings the equals() method's time complexity is O(n) in case of String objects.
    == operator, when used to compare strings, just compares the location.
    equals() method is overridable while == is not.

 */