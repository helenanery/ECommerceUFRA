public class Produto {
    private String nome;
    private double preco;
    private double volume;
    private double peso;

    // Construtor não padrão
    public Produto(String nome, double preco, double volume, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
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
