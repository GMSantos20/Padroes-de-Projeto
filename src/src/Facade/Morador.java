package Facade;

public class Morador {
    public static void main(String[] args) {


        CasaInteligenteFacade home = new CasaInteligenteFacade();

        home.iniciarModoDormir();

        home.iniciarModoAcordado();
    }
}
