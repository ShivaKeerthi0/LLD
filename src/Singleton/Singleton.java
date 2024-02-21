package Singleton;

// Lazy Loading
public class Singleton {

    // making private so that no one can access and static such that it is stored in class memory
    // so that only ne instance is created and not at object level where multi instances are created for each intialization.
    private static Singleton instance = null;

    private Singleton() {

    }

    // even this method is static as we can't access a method without object and
    // the object can only be created by this method we need to make this static to
    // store in class memory
    public static Singleton getInstance() {

        if (instance == null) {
            // Corrected line: create a new instance only if it is null
            instance = new Singleton();
        }

        return instance;
    }
}
