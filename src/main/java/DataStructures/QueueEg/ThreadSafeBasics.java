package DataStructures.QueueEg;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeBasics {


    public static void main(String[] args) throws Exception {

        Counter1 c = new Counter1();

        //new e will increment 2000times--it will take more time
/*        for (int i = 1; i <=1000; i++) {
            c.increment();
        }*/

        //now we will use multithreading tomdo it faster
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        //Join method in Java allows one thread to wait until another thread completes its execution. In simpler words, it means it waits for the other thread to die
        t1.join();
        t2.join();

        //we wont get 2000 it will have different answrr everytime-SO here comes picture of thread safety.Here value is mutable and method is not thread safe so we will get inconsistient value


        //1st way using synchronized
        //So, we will add synchronized keyword in method so while t1 finished execution than only t2 will be able to use it

        //2nd
        //Using AtomicInteger Wrapper class on variable

//        IMPORTANT
        // StringBuffer,ConcurrentHashmap Is Thread Safe
        //ConcurrentHashmap Is Thread Safe--Hasmap(collcection)
        // AtomicInteger is Thread Safe for integer
        //. PriorityBlockingQueue is thread safe


        System.out.println(c.count);

    }
}

class Counter1 {

    AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
        //get value,increment and assign its not atomic operation
    }

/*    public synchronized void increment(){
        count++;
        //get value,increment and assign its not atomic operation
    }*/


}
