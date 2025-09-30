package ObserverPP;

public class Programa {
    public static void main(String[] args) {

        //observador
        CarroPoliciaObserver policia= new CarroPoliciaObserver();
        //observado
        CarroRoubadoObservable carroRoubado= new CarroRoubadoObservable();
        //adicionando o observado ao observador
        carroRoubado.adicionarObservador(policia);

        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}
