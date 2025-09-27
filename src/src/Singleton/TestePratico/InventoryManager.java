package Singleton.TestePratico;

public class InventoryManager {
    private static InventoryManager instance;
    private int stock = 100; // Estoque inicial

    private InventoryManager() {}

    // ✅ Singleton thread-safe para gerenciar estoque
    public static synchronized InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    // ✅ Método sincronizado para evitar vendas duplicadas
    public synchronized boolean venderProduto(int quantidade) {
        if (stock >= quantidade) {
            stock -= quantidade;
            System.out.println(Thread.currentThread().getName() +
                    " vendeu " + quantidade + " unidades. Estoque: " + stock);
            return true;
        }
        System.out.println(Thread.currentThread().getName() +
                " - Estoque insuficiente!");
        return false;
    }
}

