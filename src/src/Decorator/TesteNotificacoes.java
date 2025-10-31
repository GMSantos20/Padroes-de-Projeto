package Decorator;

public class TesteNotificacoes {
    public static void main(String[] args) {
        String mensagemAlerta ="Fortes chuvas derrubam arvore na regia sul do estado!";
        String mensagemUrgente= "devido as chuvas a energia caiu!";


        System.out.println("__So email__");
        INotificador mensagemNormalEmail= new EmailNotificador();
        mensagemNormalEmail.enviar(mensagemAlerta);

        System.out.println("__Email e SMS");
        INotificador mensagemAlertaSms = new SmsNotificadorDecorator(new EmailNotificador());
        mensagemAlertaSms.enviar(mensagemUrgente);

        System.out.println("__Email, SMS, Slack");
        INotificador tudojunto = new SlackNotificadorDecorator(new SmsNotificadorDecorator(new EmailNotificador()));
        tudojunto.enviar(mensagemUrgente);

    }
}
