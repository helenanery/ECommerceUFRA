import java.util.ArrayList;
import java.util.List;

public class ECommerce {
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Pedido> pedidos;
    private List<Transportadora> transportadoras;

    // Construtor não padrão
    public ECommerce() {
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.transportadoras = new ArrayList<>();
    }

    // Getters
    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public List<Transportadora> getTransportadoras() {
        return transportadoras;
    }

    // Sobrescrevendo toString
    @Override
    public String toString() {
        return "ECommerce{" +
                "produtos=" + produtos +
                ", clientes=" + clientes +
                ", pedidos=" + pedidos +
                ", transportadoras=" + transportadoras +
                '}';
    }
}
