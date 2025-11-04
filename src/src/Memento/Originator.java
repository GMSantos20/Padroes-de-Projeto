package Memento;

public class Originator {
    private String estado;

    public Memento createMemento(){
        System.out.println("salvou o estado= " + estado);
        return new Memento(estado);
    }
    public void setMemento(Memento m){
        System.out.println("recuperou o estado = " + estado);
        this.estado= m.getEstado();
    }
}
