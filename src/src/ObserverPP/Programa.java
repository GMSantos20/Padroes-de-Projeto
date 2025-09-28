package ObserverPP;

public class Programa {
    public static void main(String[] args) {

        //observador
        CarroPolicia policia= new CarroPolicia();
        //observado
        CarroRoubado carroRoubado= new CarroRoubado();
        //adicionando o observado ao observador
        carroRoubado.adicionarObservador(policia);

        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}
