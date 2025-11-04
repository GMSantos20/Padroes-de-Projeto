package Builder;

public class Pizza {
    private final String tamanho;
    private final boolean comPeperoni;
    private final boolean comQueijo;
    private final boolean comBordaRecheada;

    private Pizza(PizzaBuilder builder){
        this.tamanho= builder.tamanho;
        this.comPeperoni= builder.comPeperoni;;
        this.comQueijo= builder.comQueijo;
        this.comBordaRecheada= builder.comBordaRecheada;
    }

    public static class PizzaBuilder{
        private final String tamanho;
        private boolean comPeperoni=false;
        private boolean comQueijo=false;
        private boolean comBordaRecheada=false;

        public PizzaBuilder(String tamanho){
            System.out.println(tamanho);
            this.tamanho=tamanho;
        }
        public PizzaBuilder comPeperoni(boolean comPeperoni){
            System.out.println("peperoni");
            this.comPeperoni=comPeperoni;
            return this;
        }
        public PizzaBuilder comQueijo(boolean comQueijo){
            System.out.println("queijo");
            this.comQueijo=comQueijo;
            return this;
        }
        public PizzaBuilder comBordaRecheada(Boolean comBordaRecheada){
            System.out.println("borda recheada");
            this.comBordaRecheada=comBordaRecheada;
            return this;
        }

        public Pizza build(){
            return  new Pizza(this);
        }



    }
}
