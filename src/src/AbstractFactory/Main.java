package AbstractFactory;

public class Main {
    private static String SistemaOperacional = "Windows";
    public static void main(String[] args) {
        IGUIFactory factory;

        if(SistemaOperacional.equalsIgnoreCase("WINDOWS")){
           factory=new WindowsFactory();
        }else if(SistemaOperacional.equalsIgnoreCase("MAC")){
            factory=new MACFactory();
        }else {
            throw new RuntimeException("SO nao suportado");
        }
        Aplication app= new Aplication(factory);
        app.paint();





    }
}
