package Bridge;

public class Quadrado extends Forma{


    public Quadrado(IRenderizador renderizador) {
        super(renderizador);
    }

    @Override
    public void desenhar() {
        renderizador.renderizarQuadrado();

    }
}
