import java.util.List;

public class ECommerce {
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Pedido> pedidos;
    private List<Transportadora> transportadoras;

    // Construtor padrão
    public ECommerce(List<Produto> produtos, List<Cliente> clientes, List<Pedido> pedidos, List<Transportadora> transportadoras) {
        this.produtos = produtos;
        this.clientes = clientes;
        this.pedidos = pedidos;
        this.transportadoras = transportadoras;
    }

    // Métodos de adicionar
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cadastrarTransportadora(Transportadora transportadora) {
        transportadoras.add(transportadora);
    }

    public void mostrarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void mostrarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
