package AbstractFactory;

public class WindowsButton implements  IButton{
    @Override
    public void paint() {
        System.out.println("desenhando Botao no Windows");
    }
}
