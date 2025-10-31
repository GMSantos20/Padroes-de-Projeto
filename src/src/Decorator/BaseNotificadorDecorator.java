package Decorator;

public abstract class BaseNotificadorDecorator implements INotificador {
    protected INotificador notificador;

    public BaseNotificadorDecorator(INotificador notificador){
        this.notificador=notificador;//guarda o proximo objeto da cadeia
    }
    public void enviar(String msg){
        this.notificador.enviar(msg);//executa o proximo objeto da cadeia
    }


}
