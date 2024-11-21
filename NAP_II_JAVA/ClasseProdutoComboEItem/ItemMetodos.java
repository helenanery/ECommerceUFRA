public class ItemMetodos {

   // Método para calcular o subtotal do item
public void calcularSubtotal() {
    this.subtotal = this.quantidade * this.produto.getPreco();
}

// Método para atualizar a quantidade e recalcular o subtotal
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
    calcularSubtotal(); // Recalcula o subtotal quando a quantidade muda
}

}
