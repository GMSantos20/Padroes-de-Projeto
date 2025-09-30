package Mediator;

public class ControladorTransito implements Mediator{
    private Carro carro;
    private Semaforo semaforo;
    private Pedestre pedestre;


    public void registrarCarro(Carro carro) {
        this.carro = carro;

    }

    public void registrarSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
        this.semaforo.setMediator(this);
    }

    public void registrarPedestre(Pedestre pedestre) {
        this.pedestre = pedestre;
        this.pedestre.setMediator(this);
    }


    @Override
    public void notificar(String evento, Object origem) {
        if (evento.equals("SEMAFORO_VERDE")) {
            carro.avancar();
            pedestre.esperar();
        } else if (evento.equals("SEMAFORO_VERMELHO")) {
            carro.parar();
            pedestre.cruzar();
        }else if(evento.equals("PEDESTRE_SOLICITA_CRUZAR")){
            semaforo.mudarParaVermelho();

        }
    }
}
