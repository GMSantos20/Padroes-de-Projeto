package Flyweight;

public class Circulo {

    public String cor;//Estado intrinseco

    public Circulo(String cor){//estado compartilhado, vao existir circulos com mesma cor ou nao
        this.cor=cor;
    }


    public void desenhar(int x, int y, int raio){

        //x, y e raio sao extrinsecos pois sao especificos para cada circulo
        System.out.println("desenhando  um circulo de cor " +" " + cor+ "em("+x+ " "+y+") com raio" + raio);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
