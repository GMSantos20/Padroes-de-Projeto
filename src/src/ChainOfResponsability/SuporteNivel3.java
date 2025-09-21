package ChainOfResponsability;

public class SuporteNivel3 extends Suporte{
    @Override
    public void resolver(String problema) {
        if(problema.equals("Software")){
            System.out.println("reinstale o programa");
        }else {
            System.out.println("Nivel3:problema desconhecido");
        }
    }
}
