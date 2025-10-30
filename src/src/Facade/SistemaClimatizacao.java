package Facade;

public class SistemaClimatizacao {
    public void ligarArCondicionado() {
        System.out.println("Ar condicionado ligado");
    }
    public void setarTemperatura(int temp) {
        System.out.println("Temperatura ajustada para " + temp + "C");
    }
    public void desligarArCondicionado() {
        System.out.println("Ar condicionado desligado");
    }
}
