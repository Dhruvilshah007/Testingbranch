package ImportantJavaConcepts.Threads;

class A1 extends Thread{
    public void run(){

        for (int i = 1; i <= 100; i++) {
            System.out.println("Hiii A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class B1 extends Thread{
    public void run(){

        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //here there ischance that 2 threads can go to sceduler at same time
            //and than scheduler decides
        }

    }
}
public class ThreadPriorityAndSleep_87 {
    public static void main(String[] args) {

        //want to print hi and hello one after another like hi hello hi hello
        A1 obj1=new A1();
        B1 obj2=new B1();

        //obj2.setPriority(Thread.MAX_PRIORITY);
        //still different scheduler have diff algo,scheduler decided priority,
        //It might go thread that has less time

        //to get priotiy of thread
        //priotiy goes from 1-10
        //1 is least priority and 10 is max priority
        //Bydefault thread has 5 default priotiy(normal priority)
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());


        //on calling start method it will execute run() method
        obj1.start();
        //want both of them to start with gap in between
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();

        //what if i want to parallely execute show() method of both Class objects


    }
}


//video link - https://www.youtube.com/watch?v=yyLy-an_CXY

/*
In this lecture we will learn:
- Thread priority in Java
- How we can suggest a priority for a thread?
- Sleep() method in thread
- Waiting state in a thread


#1
- We cannot control the schedular, we can only give suggestions to it to give priority.
- getPriority() is a method that gives the current priority of a thread.
- The range of priority goes from 1 to 10. One is the least priority whereas ten is the maximum priority.
- 5 is the default priority or normal priority. By default, every thread has a normal priority which is 5.
- We can also change the priority by using the setPriority().
- Different schedulers have different algorithms to work upon so by giving priority, we can only give suggestions to it.
- It might be possible that the scheduler gives the highest priority to the process that will execute in less time at the running phase.

#2
- We can also make a thread to wait for some time and then execute the statement further.
- Thread will wait by using the sleep() method.
- In the sleep() method, we have the pass value for how much time we want a thread to wait. The time will be in milliseconds.
- Sleep() method will throw an interrupted exception. So, we can handle an exception by using the try-catch block.
- When we use sleep(), then the thread goes into the waiting state.
- As a programmer, we can not control a thread, we can only optimise it.
 */