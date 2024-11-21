public class Produto {
    private String nome;
    private double preco;
    private double volume;
    private double peso;

    // Construtor
    public Produto(String nome, double preco, double volume, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
    }

    // Getters
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public double getVolume() { return volume; }
    public double getPeso() { return peso; }

    // Sobrescrevendo toString
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", volume=" + volume +
                ", peso=" + peso +
                '}';
    }
}
