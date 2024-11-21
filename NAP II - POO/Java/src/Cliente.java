public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    // Construtor padrão
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Construtor não padrão
    public Cliente(String nome) {
        this(nome, "Não informado", "Não informado");
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s (Email: %s, Telefone: %s)", nome, email, telefone);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
