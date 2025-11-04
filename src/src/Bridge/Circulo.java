package Bridge;



public class Circulo extends Forma{

    public Circulo(IRenderizador renderizador){
        super(renderizador);

    }

    @Override
    public void desenhar() {
        renderizador.renderizarCirculo();
    }
}
