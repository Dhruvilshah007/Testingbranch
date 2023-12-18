package ImportantJavaConcepts.ObjectClassMethods;


/*
equals method

1-Compares only objects
2-Compares address of objects for all different class objects
3-There is difference in String class, it first compares Address,if its not same than it compare char by char value
4-We can also write custom our own equals logic, by overriding equals method
 */

public class EqualsMethod {

    int x;

    EqualsMethod(int x){
        this.x=x;
    }


    //here with this overriding we are comparing data instead of address/memory location which is comapred in base class method
    boolean equals(EqualsMethod obj) {

        if (this.x==obj.x){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        EqualsMethod obj1=new EqualsMethod(10);
        EqualsMethod obj2=obj1;

        //here obj1 and obj2 will point to same location


        //it will be created to new location
        EqualsMethod obj3=new EqualsMethod(10);


        //hascode of both can also do by using .hashcode() method of object class
        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.equals(obj3));


    }
}

/*
The equals() method in Java is used to compare two objects for equality. It is defined in the Object class in Java. The equals() method compares the memory location of two objects in general. However, we can override the equals() method to define a custom logic for the comparison of two objects.

The equals() method of String class is used to compare two string objects both memory-wise and if it fails character-wise.
 */


/*
equals (Object obj)--

This method compares two objects and returns whether they are equal or not. It is used to compare the value of the object on which the method is called and the object value which is passed as the parameter.

It is usually recommended to override the hashCode() method whenever this method is overridden, as it'll ensure that equal objects must have equal hash codes.
 */

/*
Example

public boolean equals(Object obj)
{
        return (this == obj);
}

Explanation
The default implementation checks whether the two objects i.e., the object on which the method is called and the obj object are equal or not. Here equal means whether they are referring to the same object. If they are the same, it returns true, else it returns false.
 */



// equals vs == -- https://www.scaler.com/topics/difference-between-equals-method-in-java/