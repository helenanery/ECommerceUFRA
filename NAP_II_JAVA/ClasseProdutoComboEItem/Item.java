public class Item {
    private int quantidade;
    private double subtotal;
    private Produto produto; // Produto que representa este item

    // Construtor não padrão
    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        calcularSubtotal(); // Calcula o subtotal automaticamente ao criar o item
    }

    // Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
// Sobrescrevendo toString
    @Override
    public String toString() {
    return "Item{" +
            "quantidade=" + quantidade +
            ", subtotal=" + subtotal +
            ", produto=" + produto +
            '}';
    }
}

