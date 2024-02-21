package Singleton;

public class Main {

    public static  void  main(String[] args){

        ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstance();

        System.out.println(instance4);
        ThreadSafeSingleton instance5 = ThreadSafeSingleton.getInstance();

        System.out.println(instance5);

    }
}
