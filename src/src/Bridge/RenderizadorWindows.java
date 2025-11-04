package Bridge;

public class RenderizadorWindows implements IRenderizador {
    @Override
    public void renderizarCirculo() {
        System.out.println("renderizando circulo no Windows");
    }

    @Override
    public void renderizarQuadrado() {
        System.out.println("renderizando quadrado no Windows");

    }
}
