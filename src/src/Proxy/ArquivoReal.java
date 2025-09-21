package Proxy;

public class ArquivoReal implements IArquivo {
    private String conteudo;
    private String nome;

    public ArquivoReal(String nome){
        this.nome=nome;
        System.out.println("carregando arquivo "+" "+ nome +" "+ ("operaçao custosa"));
        this.conteudo="conteudo inicial do arqivo" +" "+ nome;

    }

    @Override
    public void ler() {

        System.out.println("lendo arquivo" +" "+ nome);
    }

    @Override
    public void escrever(String novoConteudo) {

        this.conteudo=novoConteudo;
        System.out.println("escrevendo  no arquivo"+" :"+ conteudo);


    }
}
