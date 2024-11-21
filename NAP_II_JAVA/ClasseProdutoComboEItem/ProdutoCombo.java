import java.util.List;

public class ProdutoCombo {
    private List<Produto> produtos; // Lista de produtos no combo
    private String tipoDesconto; // Tipo de desconto: "percentual" ou "valor"
    private double valorDesconto; // O valor do desconto, que pode ser percentual ou valor absoluto

    // Construtor não padrão
    public ProdutoCombo(List<Produto> produtos, String tipoDesconto, double valorDesconto) {
        this.produtos = produtos;
        this.tipoDesconto = tipoDesconto;
        this.valorDesconto = valorDesconto;
    }

    // Getters e Setters
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(String tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    // Sobrescrevendo toString
    @Override
    public String toString() {
    return "ProdutoCombo{" +
            "produtos=" + produtos +
            ", tipoDesconto='" + tipoDesconto + '\'' +
            ", valorDesconto=" + valorDesconto +
            '}';
    }
}
