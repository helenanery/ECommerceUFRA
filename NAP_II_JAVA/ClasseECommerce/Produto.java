public class Produto {
    private String nome;
    private double preco;
    private double volume;
    private double peso;

    public Produto(String nome, double preco, double volume, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

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
