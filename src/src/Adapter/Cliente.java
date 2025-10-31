package Adapter;

public class Cliente {
    public static void main(String[] args) {
        LojaOnline loja = new LojaOnline();
        PagamentoSuperRapido entradaIncompativel = new PagamentoSuperRapido();
        IPagamentoProcessador adapter = new PagamentoSuperRapidoAdapter(entradaIncompativel);

        double valor= 259.67;

        loja.finalizarCompra(adapter,valor);

    }
}
