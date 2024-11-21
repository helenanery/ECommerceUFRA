public class Cliente {
    private String nome;
    private String email;

    // Construtor
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    // Sobrescrevendo toString
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
