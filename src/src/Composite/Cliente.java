package Composite;

public class Cliente {
    public static void main(String[] args) {
        Arquivo meuarq=  new ArquivoSimples("musica.mp4");
        Arquivo prova= new ArquivoSimples("prova matematica");

        Pasta pasta = new Pasta("meus arquivos");
        pasta.adicionar(meuarq);
        pasta.adicionar(prova);

        meuarq.mostrar();

        pasta.mostrar();

    }
}
