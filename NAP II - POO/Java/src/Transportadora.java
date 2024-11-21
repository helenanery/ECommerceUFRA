import java.util.List;

public class Transportadora {
    private String nome;
    private double precoPorVolume;
    private double precoPorPeso;
    private int prazoEntrega;

    // Construtor padrão
    public Transportadora(String nome, double precoPorVolume, double precoPorPeso, int prazoEntrega) {
        this.nome = nome;
        this.precoPorVolume = precoPorVolume;
        this.precoPorPeso = precoPorPeso;
        this.prazoEntrega = prazoEntrega;
    }

    // Construtor não padrão
    public Transportadora(String nome) {
        this(nome, 0.0, 0.0, 0);
    }

    @Override
    public String toString() {
        return String.format("Transportadora: %s (Preço por Volume: R$ %.2f, Preço por Peso: R$ %.2f, Prazo de Entrega: %d dias)",
                nome, precoPorVolume, precoPorPeso, prazoEntrega);
    }

    // Método para calcular o frete
    public double calcularFrete(List<Item> itens) {
        double freteTotal = 0;
        for (Item item : itens) {
            Produto produto = item.getProduto();
            double precoPorVolume = this.precoPorVolume * produto.getVolume() * item.getQuantidade();
            double precoPorPeso = this.precoPorPeso * produto.getPeso() * item.getQuantidade();
            freteTotal += Math.max(precoPorVolume, precoPorPeso);
        }
        return freteTotal;
    }
}
