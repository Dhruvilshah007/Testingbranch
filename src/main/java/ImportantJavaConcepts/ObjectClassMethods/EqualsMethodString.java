package ImportantJavaConcepts.ObjectClassMethods;

public class EqualsMethodString {

    public static void main(String[] args) {

        String str1="dds";
        String str2="dds";

        String str3="Shah";

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));




    }
}


/*
Since we use strings by making objects of String Class, we can use equals() method to compare two strings. The internal implementation of the equals() method in String class is such that:

    First the comparison of objects are done on the basis of their location. If both the objects are in the same location, which both objects are same, true is returned.
    Otherwise, it performs character by character comparison. If both strings have the same value, true is returned, otherwise false.

Let us look at the code for comparing two strings using the equals() method.
 */

/*
Points to Remember:

    Since we are comparing the strings char by char using the equals() method, it is an O(n) operation where n is the size of the shortest string.
    For comparing two strings without case-sensitiveness, we can use equalsIgnoreCase() function in Java.
    For lexicographically calculating the difference between two strings, check out the compareTo() function in Java.

 */