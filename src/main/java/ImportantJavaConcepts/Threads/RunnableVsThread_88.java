/*
package Threads;

class Z{

}

//extending thread is not good idea,what if A wants to extends Z how we will achieve that as multiple inheritance is not possible here
class A2 implements  Runnable{
    public void run(){

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hiii A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

class B2 implements Runnable{
    public void run(){

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

public class RunnableVsThread_88 {
    public static void main(String[] args) {
*/
/*      A2 obj1=new A2();
        B2 obj2=new B2();*//*


        //so here obj1 and obj2 are objects of Runnable interface
        //we can also write above as

        Runnable obj1=new A2();
        Runnable obj2=new B2();



        //on calling start method it will execute run() method
        //start method is n Thread class while run() is in runnable interface(functional interface)

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
*/

//connverting to lambda expression

package ImportantJavaConcepts.Threads;

class Z{

}

//extending thread is not good idea,what if A wants to extends Z how we will achieve that as multiple inheritance is not possible here
/*class A2 implements  Runnable{
    public void run(){

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hiii A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}*/

/*class B2 implements Runnable{
    public void run(){

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}*/

public class RunnableVsThread_88 {
    public static void main(String[] args) {
/*        A2 obj1=new A2();
        B2 obj2=new B2();*/

        //so here obj1 and obj2 are objects of Runnable interface
        //we can also write above as

        //removing class and converting to anonymns class and now anonymns class to lambda expression

//        Class->anonymns class->lambda expression

        Runnable obj1=()-> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hiii A");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

        };
        Runnable obj2=()-> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello B");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };


        //on calling start method it will execute run() method
        //start method is n Thread class while run() is in runnable interface(functional interface)

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}


//vide link  -https://www.youtube.com/watch?v=Z4KSgLpY0d8

/*

In this lecture we will learn:
- Using thread through Runnable interface
- How to start a thread with a Runnable interface
- Difference between extending a thread and implementing a runnable interface
- Use of anonymous class with runnable interface
- Creating a thread with lambda expression


#1
Multiple Inheritance is not supported by Java. So, extending a thread is not a good practice to follow.
- Thread is a class that implements Runnable and Runnable contains a method known as the run() method.
- Instead of extending a thread, we can also implement it through an interface called Runnable.
 class A implements Runnable
 {
  public void run()
  {
   statements;
  }
 }

#2
- In the Runnabe method, the start() method is not present so we can not use it by implementing Runnable simply.
- Thread has multiple constructors and one of the constructors takes a runnable object.
- We cannot create an object of a thread by using a class name.
- Objects for a thread will be created by using a Runnable keyword. So, we create a reference of an interface and an object of a class
e.g., Runnable obj= new A();
- We have to pass a reference to an object in the thread class.
- After creating a reference of the Runnable class, we can use the start() method with the thread.

#3
- We can create a thread byR using two methods:
 1. Extend a thread class
 2. Implement a Runnable interface
The runnable interface does not have thread methods, in that case, we need to create a separate thread object to use features.

#4
- We can also instantiate a runnable interface by using an anonymous class.
- Runnable is a functional interface so we also use lambda expression with it.
 */
