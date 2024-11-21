public class Produto {
    private String nome;
    private double preco;
    private double volume;
    private double peso;

    // Construtor padrão
    public Produto(String nome, double preco, double volume, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
    }

    // Construtor não padrão
    public Produto(String nome, double preco) {
        this(nome, preco, 0.0, 0.0);
    }

    @Override
    public String toString() {
        return String.format("Produto: %s (Preço: R$ %.2f, Volume: %.2f m³, Peso: %.2f kg)", nome, preco, volume, peso);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getVolume() {
        return volume;
    }

    public double getPeso() {
        return peso;
    }
}
