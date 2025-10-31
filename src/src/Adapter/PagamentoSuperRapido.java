package Adapter;

public class PagamentoSuperRapido {
    public void cobrarViaPix(int valorEmCentavos) {
        System.out.println("PagamentoSuperRápido: Cobrando R$ " + (valorEmCentavos / 100.0) + " via PIX.");
    }
}
