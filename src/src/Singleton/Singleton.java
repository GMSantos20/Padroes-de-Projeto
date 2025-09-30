package Singleton;

public class Singleton {

    private static  volatile Singleton instance;

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

}
