package ChainOfResponsability;

public class Programa {
    public static void main(String[] args) {
        System.out.println("===Suporte tecnico===");

        Suporte nivel1=new SuporteNivel1();
        Suporte nivel2= new SuporteNivel2();
        Suporte nivel3= new SuporteNivel3();

        nivel1.setProximo(nivel2);
        nivel2.setProximo(nivel3);

        String[] problemas= {"internet","hardware","Software","virus"};

        for(String problema: problemas){
            System.out.println("\nproblema" + " "+ problema);
            nivel1.resolver(problema);
        }

    }
}
