package AbstractFactory;

public class MACFactory implements IGUIFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
