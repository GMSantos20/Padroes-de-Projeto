package Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Arquivo{

    private String nomeArq;

    private List<Arquivo> arquivos = new ArrayList<>();

    public Pasta(String nome){
        this.nomeArq=nome;
    }
    public void adicionar(Arquivo arq){
        arquivos.add(arq);
    }
    public void remover(Arquivo arq){
        arquivos.remove(arq);
    }
    @Override
    public void mostrar() {
        System.out.println("Pasta: "+  nomeArq);
        for(Arquivo arq: arquivos){
            arq.mostrar();
        }

    }
}
