package AbstractFactory;

public class WindowsCheckBox implements  ICheckBox {

    @Override
    public void paint() {
        System.out.println("desenhando CheckBox no windows");
    }
}
