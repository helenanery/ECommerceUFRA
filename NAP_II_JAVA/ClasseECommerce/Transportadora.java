public class Transportadora {
    private String nome;
    private double precoPorKm;

    public Transportadora(String nome, double precoPorKm) {
        this.nome = nome;
        this.precoPorKm = precoPorKm;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Transportadora{" +
                "nome='" + nome + '\'' +
                ", precoPorKm=" + precoPorKm +
                '}';
    }
}
