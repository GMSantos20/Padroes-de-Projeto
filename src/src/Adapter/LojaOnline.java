package Adapter;

public class LojaOnline {
    public void finalizarCompra(IPagamentoProcessador processador, double total) {
        System.out.println("Iniciando processo de compra no valor de R$ " + total);
        processador.processarPagamento(total);
        System.out.println("Compra finalizada com sucesso!");
    }

}
