package Singleton;

public class SingletonEAGER {

    private static final SingletonEAGER INSTANCE = new SingletonEAGER();

    private SingletonEAGER(){}

    public static SingletonEAGER getInstance(){
        return INSTANCE;
    }
}
