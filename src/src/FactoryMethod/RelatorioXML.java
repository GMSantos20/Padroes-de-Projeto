package FactoryMethod;

public class RelatorioXML implements IRelatorio{
    @Override
    public void gerar() {
        System.out.println("Gerando relatorio XML");
    }
}
