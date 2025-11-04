package FactoryMethod;

public class RelatorioPDF implements IRelatorio{

    @Override
    public void gerar() {
        System.out.println("Gerando Relatorio PDF");
    }
}
