public class Item {
    private int quantidade;
    private double subtotal;
    private Produto produto;

    // Construtor
    public Item(int quantidade, Produto produto) {
        this.produto = produto;
        setQuantidade(quantidade); // A quantidade é definida e o subtotal é automaticamente calculado
    }

    // Getter para quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Setter para quantidade (apenas define a quantidade)
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Getter para o subtotal
    public double getSubtotal() {
        return subtotal;
    }

    // Getter para o produto
    public Produto getProduto() {
        return produto;
    }

    // Setter para o produto
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    // Método para calcular o subtotal
    public void calcularSubtotal() {
        this.subtotal = produto.getPreco() * quantidade;
    }
}
