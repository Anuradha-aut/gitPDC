
package gitdemocomp603;

/**
 *
 * @author anusingh
 */
public class W9_02_SingletonInitialization {

    public static void main(String args[]) {
        EagerInitializedSingleton ei1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton ei2 = EagerInitializedSingleton.getInstance();;

        System.out.println(ei1);
        System.out.println(ei2);

        System.out.println(ei1.equals(ei2));
        System.out.println(ei1 == ei2);
        System.out.println("Test");
    }

}

//    Eager Initialized Singleton
class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

//Static Block Singleton
class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

// Lazy Initialization
class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

// Thread Safe
class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    @SuppressWarnings("DoubleCheckedLocking")
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
