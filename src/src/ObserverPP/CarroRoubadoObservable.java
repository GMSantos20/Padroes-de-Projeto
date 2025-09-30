package ObserverPP;

import java.util.ArrayList;
import java.util.List;


public class CarroRoubadoObservable implements Carro {
    private List<CarroObserver> observadores = new ArrayList<>();



    public  void adicionarObservador(CarroObserver carro){
        observadores.add(carro);

    }
    public void removerObservador(CarroObserver observador) {
        observadores.remove(observador);
    }

    public void notificarObservador(String acao){
        for(CarroObserver observador: observadores){
            observador.atualizar(acao);
        }
    }
    @Override
    public void frente() {
        System.out.println("carro roubado segue em frente");
        notificarObservador("frente");
    }

    @Override
    public void esquerda() {
        System.out.println("carro roubado vira a esquerda");
        notificarObservador("esquerda");
    }

    @Override
    public void direita() {
        System.out.println("carro roubado vira a direita");
        notificarObservador("direita");
    }

    @Override
    public void para() {
        System.out.println("carro roubado para");
        notificarObservador("para");
    }

}
