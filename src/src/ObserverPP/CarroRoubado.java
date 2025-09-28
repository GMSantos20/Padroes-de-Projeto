package ObserverPP;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {

    private String acao;

    @Override
    public void frente() {
        acao="frente";
        System.out.println("carro roubado segue em frente");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        acao="esquerda";
        System.out.println("carro roubado vira a esquerda");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        acao="direita";
        System.out.println("carro roubado vira a direita");
        this.mudaEstado();
    }

    @Override
    public void para() {
        acao="para";
        System.out.println("carro roubado para");
        this.mudaEstado();
    }
    public void mudaEstado(){
        setChanged();//mudou o estado
        notifyObservers(acao);//avisa ao objeto
    }
}
