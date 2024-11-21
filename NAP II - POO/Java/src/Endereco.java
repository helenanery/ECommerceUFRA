public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String nome;

    // Construtor padrão
    public Endereco(String logradouro, String numero, String complemento, String nome) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.nome = nome;
    }

    // Construtor não padrão
    public Endereco(String logradouro, String numero, String nome) {
        this(logradouro, numero, "Sem complemento", nome);
    }

    @Override
    public String toString() {
        return String.format("Endereço: %s, %s, %s, %s", logradouro, numero, complemento, nome);
    }
}
