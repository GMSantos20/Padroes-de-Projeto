package ChainOfResponsability;

public class SuporteNivel2 extends Suporte{
    @Override
    public void resolver(String problema) {
        if(problema.equals("hardware")){
            System.out.println("troque o hardware defeituoso");
        }else if(proximo !=null){
            System.out.println("Nivel2:nao consigo resolver, passando para o proximo nivvel");
            proximo.resolver(problema);
        }
    }
}
