package Builder;

public class Cliente {
    public static void main(String[] args) {


        Pizza pizza = new Pizza.PizzaBuilder("Grande")
                .comBordaRecheada(true)
                .comPeperoni(true)
                .comQueijo(true)
                .build();



    }



}
