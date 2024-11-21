// Teste de Implementação

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Livro de Java", 50.0, 1.2, 0.8);

        // Criar item com 2 unidades
        Item item = new Item(2, produto);
        ItemMetodos.calcularSubtotal(item);  // Calcula subtotal
        System.out.println("Subtotal inicial: " + item.getSubtotal());  // Deve ser 100.0 (2 * 50.0)

        // Alterar quantidade
        ItemMetodos.setQuantidade(item, 3);  // Atualiza a quantidade e o subtotal
        System.out.println("Subtotal após alterar a quantidade: " + item.getSubtotal());  // Deve ser 150.0 (3 * 50.0)
    }
}
