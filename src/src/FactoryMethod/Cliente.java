package FactoryMethod;

public class Cliente {
    public static void main(String[] args) {

        GeradorDeRealatorioCreator relPdf= new GeradorDeRelatorioPDF();
        relPdf.gerarEProcessar();

        GeradorDeRealatorioCreator relCSV= new GeradorDeRelatorioCSV();
        relCSV.gerarEProcessar();

        GeradorDeRealatorioCreator RelXML = new GeradorDeRelatorioXML();
        RelXML.gerarEProcessar();
    }
}
