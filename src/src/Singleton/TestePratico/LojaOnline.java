package Singleton.TestePratico;

public class LojaOnline {
    public static void main(String[] args) {
        // Simulando 10 usuários comprando simultaneamente
        for (int i = 1; i <= 10; i++) {
            final int userId = i;
            new Thread(() -> {
                InventoryManager inventory = InventoryManager.getInstance();
                inventory.venderProduto(15); // Cada um compra 15 unidades
            }, "Usuario-" + userId).start();
        }
    }
}

