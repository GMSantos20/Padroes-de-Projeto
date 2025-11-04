package Bridge;

public abstract class Forma {

    protected IRenderizador renderizador;

    public Forma(IRenderizador renderizador){
        this.renderizador=renderizador;
    }

    public abstract void desenhar();


}
