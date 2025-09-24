package Flyweight;

public class Programa {
    public static String[] cores ={"vermelho", "Azul","verde","amarelo","preto","branco"};
    public static void main(String[] args) {

        FabricaCirculos fabrica = new FabricaCirculos();

        for (int i = 0; i < 20; i++) {
            Circulo circulo = fabrica.getCirculo(CorAleatoria());
            circulo.desenhar(xAleatorio(),yAleatorio(),raioAleatorio());
        }
    }
    public static String CorAleatoria(){
        return cores[(int) (Math.random() * cores.length)];
    }
    public static int xAleatorio(){
        return (int)(Math.random()*100);
    }
    public static int yAleatorio(){
        return  (int)(Math.random()*100);
    }
    public static int raioAleatorio(){
        return (int)(Math.random()*100);
    }

}
