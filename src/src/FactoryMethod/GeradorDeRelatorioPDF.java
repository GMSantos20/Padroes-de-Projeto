package FactoryMethod;

public class GeradorDeRelatorioPDF extends  GeradorDeRealatorioCreator{
    @Override
    protected IRelatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
