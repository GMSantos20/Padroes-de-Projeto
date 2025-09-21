package Proxy;

public class ProxyArquivo implements IArquivo{

    private ArquivoReal arquivoReal;
    private String usuario;
    private String nomeArquivo;
    private boolean temPermissao;

    public ProxyArquivo(String usuario, String nomeArquivo, boolean temPermissao){

        this.usuario=usuario;
        this.nomeArquivo=nomeArquivo;
        this.temPermissao=temPermissao;
    }


    @Override
    public void ler() {
        if(arquivoReal == null){
            arquivoReal=new ArquivoReal(nomeArquivo);
        }
        System.out.println("usuario" +" "+ usuario+" "+ "esta lendo o arquivo");
        arquivoReal.ler();
    }

    @Override
    public void escrever(String c) {
        if(!temPermissao){
            System.out.println("ERRO"+" "+ usuario+ " "+"nao tem permissao para escrever neste arquivo");
            return;
        }
        if( arquivoReal == null){
            arquivoReal= new ArquivoReal(nomeArquivo);
        }
        System.out.println("usuario" + " "+usuario+ " "+"esta escrevendo no arquivo");
        arquivoReal.escrever(c);

    }
}
