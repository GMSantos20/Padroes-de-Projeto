package Memento;


import java.util.Stack;

public class CareTaker {
    private Originator o;
    private Stack<Memento> estados = new Stack<>();

    public CareTaker(Originator o){
        this.o=o;
    }
    public void salvarEstado(){
        estados.push(o.createMemento());
    }
    public void undo(){
        o.setMemento(estados.pop());
    }
}
