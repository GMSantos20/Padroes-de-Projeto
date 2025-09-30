package ObserverPP;


public class CarroPoliciaObserver implements  CarroObserver,Carro{
    @Override
    public void atualizar(String acao) {
        System.out.print("Policia percebeu a açao: ");

        switch (acao){
            case "frente"-> frente();
            case "esquerda"-> esquerda();
            case "direita"-> direita();
            case"para"-> para();
        }
    }
    @Override
    public void frente() {
        System.out.println("viatura segue em frente");
    }

    @Override
    public void esquerda() {
        System.out.println("viatura vira a esquerda");
    }

    @Override
    public void direita() {
        System.out.println("viatura vira direita");
    }

    @Override
    public void para() {
        System.out.println("viatura para");
    }


}
