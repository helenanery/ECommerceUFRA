public class Item {
    private int quantidade;
    private Produto produto;

    // Construtor padrão
    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Construtor não padrão
    public Item(Produto produto) {
        this(produto, 1);
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Item: %s (Qtd: %d, Subtotal: R$ %.2f)", produto.getNome(), quantidade, calcularSubtotal());
    }

    // Getters
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
