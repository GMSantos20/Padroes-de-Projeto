package AbstractFactory;

public class Aplication {
    private IButton botao;
    private ICheckBox checkBox;


    public Aplication(IGUIFactory fabrica){
        botao= fabrica.createButton();
        checkBox= fabrica.createCheckBox();
    }

    public void paint(){
        botao.paint();
        checkBox.paint();
    }
}
