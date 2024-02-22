package Singleton;

public class ThreadSafeSingleton {

    // making this variable volatile so that it is stored in the main memory and not in the cpu cache so that the threads are
    //needed to be fetched from the main memory instead of cpu cache(which is individual foe each thread)
    private static  volatile  ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance(){

        if(instance == null ){

            // synchronized keyword ensures that the thread needed to be access memory from the main memory and
            // not from the cpu cache and it maintains a mutual exclusion on the object of "ThreadSafeSingleton.class"
            // so that only one thread can only access this particular block of code at a time.
            synchronized (ThreadSafeSingleton.class){

                // double locking is done (that is checking if the instance is null because before coming to this block
                // there may be instance already created by
                // one thread at this point of time)

                if(instance == null){
                    return instance= new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
