package Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}



    // double checked locking
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){//gartantimos que teramos uma unica instancia tendo
                if (instance == null){      //muitas threads ou nao;
                    instance= new Singleton();
                }
            }

        }
        return instance;
    }
    /**
     *
     * thread safe
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }
     **/
}
