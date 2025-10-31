package Adapter;

public class PagamentoSuperRapidoAdapter implements  IPagamentoProcessador{

    private PagamentoSuperRapido pagamentoSuperRapido;


    public PagamentoSuperRapidoAdapter(PagamentoSuperRapido pagamentoSuperRapido){
        this.pagamentoSuperRapido=pagamentoSuperRapido;
    }
    @Override
    public void processarPagamento(double valor) {
       int valorconvertido = (int) (valor * 100 );
       this.pagamentoSuperRapido.cobrarViaPix(valorconvertido);

    }
}
