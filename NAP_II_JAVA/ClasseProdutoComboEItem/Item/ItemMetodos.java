public class ItemMetodos {

    // Método para calcular o subtotal
    public static void calcularSubtotal(Item item) {
        item.calcularSubtotal();
    }

    // Método para atualizar a quantidade e recalcular o subtotal
    public static void setQuantidade(Item item, int quantidade) {
        item.setQuantidade(quantidade);
        calcularSubtotal(item); // Atualiza o subtotal automaticamente
    }
}
