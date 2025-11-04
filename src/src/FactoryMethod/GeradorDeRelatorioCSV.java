package FactoryMethod;

public class GeradorDeRelatorioCSV extends GeradorDeRealatorioCreator{
    @Override
    protected IRelatorio criarRelatorio() {
        return new RelatorioCSV();
    }
}
