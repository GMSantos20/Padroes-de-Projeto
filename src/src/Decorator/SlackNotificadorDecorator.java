package Decorator;

public class SlackNotificadorDecorator extends BaseNotificadorDecorator{
    public SlackNotificadorDecorator(INotificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String msg) {
        super.enviar(msg);
        System.out.println("enviando mensagem Slack:" + msg);
    }
}
