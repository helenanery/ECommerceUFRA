import java.util.List;

public class ProdutoCombo extends Produto {
    private String tipoDesconto;
    private double valorDesconto;
    private List<Produto> listaProdutos; // Lista de produtos que compõem o combo

    // Construtor
    public ProdutoCombo(String nome, double preco, double volume, double peso, String tipoDesconto, double valorDesconto, List<Produto> listaProdutos) {
        super(nome, preco, volume, peso);
        this.tipoDesconto = tipoDesconto;
        this.valorDesconto = valorDesconto;
        this.listaProdutos = listaProdutos;
    }

    // Getters e setters
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

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
