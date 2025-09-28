package ObserverPP;

public class Programa {
    public static void main(String[] args) {

        //observador
        CarroPolicia carropolicia= new CarroPolicia();
        //observado
        CarroRoubado carroRoubado= new CarroRoubado();
        //adicionando o observado ao observador
        carroRoubado.addObserver(carropolicia);


        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}
