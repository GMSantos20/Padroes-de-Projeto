package FactoryMethod;

public class GeradorDeRelatorioXML extends GeradorDeRealatorioCreator{
    @Override
    protected IRelatorio criarRelatorio() {
        return new RelatorioXML();
    }
}
