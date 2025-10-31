package Decorator;

public class EmailNotificador implements  INotificador{
    @Override
    public void enviar(String msg) {
        System.out.println("Enviando  Email:" +  msg);
    }
}
