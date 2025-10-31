package Mediator;

public class Pedestre {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void esperar() {
        System.out.println(" Pedestre esperando");
    }

    public void cruzar() {
        System.out.println(" Pedestre cruzando a rua");
    }

    public void solicitarPassagem() {
        System.out.println(" Pedestre solicitando para cruzar");
        mediator.notificar("PEDESTRE_SOLICITA_CRUZAR", this);
    }
}
