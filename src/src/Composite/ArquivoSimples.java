package Composite;

public class ArquivoSimples implements Arquivo{

    private String nomeArquivo;

    public ArquivoSimples(String nomeArquivo){
        this.nomeArquivo=nomeArquivo;
    }




    @Override
    public void mostrar() {
        System.out.println("Arquivo simples nome:" + nomeArquivo);

    }
}
