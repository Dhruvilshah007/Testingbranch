package ImportantJavaConcepts.LambdaExpression;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Person{
    int age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, String name) {
        super();
        this.age = age;
        this.name = name;

    }
}

//https://www.scaler.com/topics/java/lambda-expression-in-java/
public class LambdaClassEg {

    public static void main(String[] args) {

        System.out.println("Main here");

        //1 anonymous inner class without parameter

//        MyInter obj=new MyInter() {
//            @Override
//            public void myInterMethod() {
//                System.out.println("Implemented functional interface with anonymns inner class property");
//            }
//        };
//        obj.myInterMethod();

        //2lambda Expression without parameter

//        MyInter p2=()->{
//            System.out.println("Implemented functional interface with Lambda Expresssion");
//        };
//
//        p2.myInterMethod();


        //now doing same thing with paramterize

        //1 anonymous inner class with parameter

/*        MyParamInter paramObj=new MyParamInter() {

            @Override
            public void sayHello(String name, String surname, int age) {
                System.out.println("Hello my name is "+name+" "+surname+ " and my age is:"+age);
            }
        };

        paramObj.sayHello("Dhruvil","Shah",22);*/


        //2 lambda Expression with parameter

/*        MyParamInter lambdaParam=(name,surname,age)->{
            System.out.println("Hello my name is "+name+" "+surname+ " and my age is:"+age);
        };
        lambdaParam.sayHello("Dhruvil","Shah",22);*/


        // Iterating Collections Using the Foreach Loop--using lambda expression for iterating

/*        List<String> list=new ArrayList<String>();

        list.add("Himanshu");
        list.add("Jatin");
        list.add("Virat");
        list.add("Jai");

        list.forEach((element)->{
            System.out.println(element);
        });*/



//        Java Lambda Expression With or Without Return Keyword
//         If there is only one statement in a Java lambda expression, you can avoid using the return keyword. When a             lambda expression comprises multiple statements, you must use the return keyword.

        // Lambda expression without return keyword.
       /* AddInter addInter=(a,b)->(a+b);
        System.out.println(addInter.sum(2,3));*/

        // Lambda expression with return keyword.

/*        AddInter addInter1=(int a,int b)->{
            return a+b;
        };
        System.out.println(addInter1.sum(5,5));*/


//        Java Lambda Expression - Filter Collection Data

        List<Person> list1=new ArrayList<>();
        list1.add(new Person(21,"dds"));
        list1.add(new Person(24,"ram"));
        list1.add(new Person(19,"ketan"));
        list1.add(new Person(26,"rajesh"));
        list1.add(new Person(29,"John"));

        // using lambda to filter data
        Stream<Person> filterData=list1.stream().filter(p->p.age<25);

        // using lambda to iterate through collection
        filterData.forEach(p->{
            System.out.println(p.name +" "+ p.age);
        });

        //Java Lambda Expression - Comparator
        //Java Lambda Expression - Creating Thread

        //such way many examples are there













    }
}
