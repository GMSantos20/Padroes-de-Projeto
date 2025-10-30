package Facade;

public class CasaInteligenteFacade {

    private SistemaLuz luzes;
    private  SistemaClimatizacao clima;
    private  SistemaSom som;
    private SistemaSeguranca seguranca;


    public CasaInteligenteFacade(){
        this.luzes=new SistemaLuz();
        this.clima=new SistemaClimatizacao();
        this.som=new SistemaSom();
        this.seguranca=new SistemaSeguranca();
    }


    public void iniciarModoDormir(){
        luzes.apagarLuzes();
        clima.ligarArCondicionado();
        clima.setarTemperatura(20);
        som.desligarCaixasDeSom();
        seguranca.ativarModoNoturno();

    }
    public void iniciarModoAcordado(){
        luzes.acenderLuzes(50);
        clima.desligarArCondicionado();
        som.ligarCaixasDeSom();
        som.selecionarMusica("BregaFunk");
        seguranca.desativarModoNoturno();

    }
}
