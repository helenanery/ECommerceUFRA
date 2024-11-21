import java.util.ArrayList;
import java.util.List;

public class ECommerce {
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Pedido> pedidos;
    private List<Transportadora> transportadoras;

    public ECommerce() {
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.transportadoras = new ArrayList<>();
    }

    // Getters
    public List<Produto> getProdutos() { return produtos; }
    public List<Cliente> getClientes() { return clientes; }
    public List<Pedido> getPedidos() { return pedidos; }
    public List<Transportadora> getTransportadoras() { return transportadoras; }

    // Métodos adicionais para adicionar novos itens ao ECommerce
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void adicionarTransportadora(Transportadora transportadora) {
        this.transportadoras.add(transportadora);
    }
}
