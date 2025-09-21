package ChainOfResponsability;

public class SuporteNivel1 extends Suporte{
    @Override
    public void resolver(String problema) {
        if (problema.equals("internet")){
            System.out.println("reinicie o modem!");
        }else if(proximo !=null){
            System.out.println("Nivel1:nao consigo resolver, passando para o proximo nivel");
            proximo.resolver(problema);
        }
    }
}
