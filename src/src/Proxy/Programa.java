package Proxy;

public class Programa {

    public static void main(String[] args) {
        System.out.println("====Sistema de Arquivos com Proxy====");

       IArquivo arq1= new ProxyArquivo("joao","MeuTcc.txt", true);

       IArquivo arq2= new ProxyArquivo("maria","foto.jpg",  false);


        System.out.println("joao tentando escrever(tem permissao)");
        arq1.escrever("modificaçao do meu tcc");

        System.out.println("maria tentando escrever(Nao tem permissao)");
        arq2.escrever("adiconando descriçao");

        System.out.println("joao lendo(tem permissao)");
        arq1.ler();
        System.out.println("maria lendo(tem permissao)");
        arq2.ler();



    }
}
