package Decorator;

public class SmsNotificadorDecorator extends BaseNotificadorDecorator {

    public SmsNotificadorDecorator(INotificador notificador) {
        super(notificador);
    }
    @Override
    public void enviar(String msg) {
        super.enviar(msg);
        System.out.println("enviando mensagem Sms:" + msg);
    }
}
