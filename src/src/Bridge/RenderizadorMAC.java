package Bridge;

public class RenderizadorMAC implements IRenderizador{
    @Override
    public void renderizarCirculo() {
        System.out.println("renderizando circulo no MAC");
    }

    @Override
    public void renderizarQuadrado() {
        System.out.println("renderizando quadrado no MAC");
    }
}
