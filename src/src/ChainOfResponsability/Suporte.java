package ChainOfResponsability;

public abstract class Suporte {

    protected Suporte proximo;

    public void setProximo(Suporte proximo){
        this.proximo=proximo;
    }

    public abstract void resolver(String problema);
}
