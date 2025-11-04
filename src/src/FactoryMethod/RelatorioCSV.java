package FactoryMethod;

public class RelatorioCSV implements IRelatorio{


    @Override
    public void gerar() {
        System.out.println("Gerando relatorio csv");
    }
}
