package FactoryMethod;

public abstract class GeradorDeRealatorioCreator {

    protected abstract IRelatorio criarRelatorio();

    public void gerarEProcessar(){
        IRelatorio relatorio=criarRelatorio();

        System.out.println("Gerando processo");
        relatorio.gerar();
        System.out.println("Processo finalizado");
    }
}
