package Mediator;

public class Programa {
    public static void main(String[] args) {

        ControladorTransito mediator = new ControladorTransito();


        Carro carro = new Carro();
        Semaforo semaforo = new Semaforo();
        Pedestre pedestre = new Pedestre();
        Moto moto = new Moto();


        // Registra todos no mediator
        mediator.registrarCarro(carro);
        mediator.registrarSemaforo(semaforo);
        mediator.registrarPedestre(pedestre);
        mediator.regsitrarMoto(moto);



        System.out.println("=== SISTEMA DE TRÂNSITO INICIADO ===\n");


        semaforo.mudarParaVerde();      // Carro avança, Pedestre espera
        System.out.println();

        semaforo.mudarParaVermelho();   // Carro para, Pedestre cruza
        System.out.println();

        pedestre.solicitarPassagem();

    }
}
