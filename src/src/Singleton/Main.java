package Singleton;

public class Main {

        public static void main(String[] args) {

            System.out.println("===  TESTE DE SINGLETONS ===\n");

            // 1.  Teste do Singleton com Double-Checked Locking
            System.out.println("1.  Double-Checked Locking Singleton:");
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();

            if(s1 == s2){
                System.out.println("    SINGLETON FUNCIONOU - Mesma instância!");
                System.out.println("   Hash s1: " + System.identityHashCode(s1));
                System.out.println("   Hash s2: " + System.identityHashCode(s2));
            } else {
                System.out.println("    NÃO FUNCIONOU - Instâncias diferentes!");
            }
            System.out.println();

            // 2.  Teste do Singleton EAGER
            System.out.println("2.  Eager Initialization Singleton:");
            SingletonEAGER eager1 = SingletonEAGER.getInstance();
            SingletonEAGER eager2 = SingletonEAGER.getInstance();

            if(eager1 == eager2){
                System.out.println("    EAGER FUNCIONOU - Mesma instância!");
                System.out.println("   Hash eager1: " + System.identityHashCode(eager1));
                System.out.println("   Hash eager2: " + System.identityHashCode(eager2));
            } else {
                System.out.println("    EAGER NÃO FUNCIONOU!");
            }
            System.out.println();

            // 3.  Teste do Singleton ENUM
            System.out.println("3.  Enum Singleton:");
            SingletonEnum enum1 = SingletonEnum.INSTANCE;
            SingletonEnum enum2 = SingletonEnum.INSTANCE;

            if(enum1 == enum2){
                System.out.println("    ENUM FUNCIONOU - Mesma instância!");
                System.out.println("   Hash enum1: " + System.identityHashCode(enum1));
                System.out.println("   Hash enum2: " + System.identityHashCode(enum2));
            } else {
                System.out.println("    ENUM NÃO FUNCIONOU!");
            }
            System.out.println();

            // 4. Teste do Thread-Safe com Synchronized Method
            System.out.println("4. Thread-Safe Synchronized Singleton:");
            ThreadSafe ts1 = ThreadSafe.getInstance();
            ThreadSafe ts2 = ThreadSafe.getInstance();

            if(ts1 == ts2){
                System.out.println("THREAD-SAFE FUNCIONOU - Mesma instância!");
                System.out.println("   Hash ts1: " + System.identityHashCode(ts1));
                System.out.println("   Hash ts2: " + System.identityHashCode(ts2));
            } else {
                System.out.println("    THREAD-SAFE NÃO FUNCIONOU!");
            }




        }

}
