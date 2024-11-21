public class Transportadora {
    private String nome;
    private double precoPorKm;

    // Construtor
    public Transportadora(String nome, double precoPorKm) {
        this.nome = nome;
        this.precoPorKm = precoPorKm;
    }

    // Getter
    public String getNome() { return nome; }
    public double getPrecoPorKm() { return precoPorKm; }

    // Sobrescrevendo toString
    @Override
    public String toString() {
        return "Transportadora{" +
                "nome='" + nome + '\'' +
                ", precoPorKm=" + precoPorKm +
                '}';
    }

    // Método para calcular preço do frete
    public double calcularPrecoFrete(Pedido pedido) {
        // Cálculo do frete baseado no preço por km
        return pedido.getSubtotal() * 0.1 + precoPorKm * 10;  // Exemplo simples
    }
}
