package Mediator;

public class Semaforo {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void mudarParaVerde() {
        System.out.println("Semaforo verde");
        mediator.notificar("SEMAFORO_VERDE", this);
    }

    public void mudarParaVermelho() {
        System.out.println("Semaforo vermelho");
        mediator.notificar("SEMAFORO_VERMELHO", this);
    }
}
a