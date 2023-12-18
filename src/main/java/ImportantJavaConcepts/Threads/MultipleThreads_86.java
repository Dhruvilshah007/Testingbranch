package ImportantJavaConcepts.Threads;


class A extends Thread{
    public void run(){

        for (int i = 1; i <= 100; i++) {
            System.out.println("Hiii A");
        }

    }
}

class B extends Thread{
    public void run(){

        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello B");
        }

    }
}
public class MultipleThreads_86 {

    public static void main(String[] args) {

        A obj1=new A();
        B obj2=new B();


        //on calling start method it will execute run() method
        obj1.start();
        obj2.start();

        //what if i want to parallely execute show() method of both Class objects


    }
}


//We have changed 10 to 100(in for loop) so we can clearly see that threads are running in parallel

//vide Link - https://www.youtube.com/watch?v=UfMM924sBvg

/*
In this lecture we will learn:
- Multiple Threads in Java
- How to create a thread?
- How we can do parallel programming?
- start() and run() methods in multithreading
- Time-sharing between multiple threads


#1
When you build an application, we use certain frameworks and behind the scene, these frameworks will create threads.
- Every statement runs in a sequence in the main method.
- If you want to execute two behaviours to execute at the same time, then we can use threads.
- We can not execute normal objects in multiple threads or normal objects can not be executed simultaneously.

#2
- Java provides a Thread class to achieve thread programming. The thread class provides constructors and methods to create and perform operations on a thread.
- A thread can be created by extending the thread class. The thread class can be extended through the Thread keyword.
- By using the Thread keyword with class, it will not create a new thread.

#3
- We have to use the start() method in the main to start the execution of a new thread.
 - start() is a method that is present inside the thread class. start() method only calls the run method.
- Start() invokes the run() method on the Thread object.
- run method should be present inside every thread to start a new thread.
- run() method is used to do an action for a thread.

#4
- All threads cannot run at the same time, so threads go for the time sharing.
-In this time-sharing Operating system, many processes are allocated with computer resources in respective time slots.
- Scheduler is responsible to allow which thread to execute at what time.
 */