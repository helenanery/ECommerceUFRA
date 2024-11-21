import java.util.List;

public class MetodosECommerce {

    // Método pagar (sem voucher)
    public static boolean pagar(ECommerce ecommerce, Pedido pedido, double valor) {
        if (valor >= pedido.getTotal()) {
            ecommerce.getPedidos().add(pedido); // Pedido finalizado com sucesso
            return true;
        }
        return false; // Pagamento insuficiente
    }

    // Método pagar (com voucher)
    public static boolean pagar(ECommerce ecommerce, Pedido pedido, double valor, String voucher) {
        double desconto = (voucher != null) ? pedido.getTotal() * 0.1 : 0;
        double totalComDesconto = pedido.getTotal() - desconto;

        if (valor >= totalComDesconto) {
            ecommerce.getPedidos().add(pedido); // Pedido finalizado com sucesso
            return true;
        }
        return false; // Pagamento insuficiente
    }

    // Método cadastrar cliente
    public static void cadastrarCliente(ECommerce ecommerce, Cliente cliente) {
        ecommerce.getClientes().add(cliente);
    }

    // Método comprar produto
    public static void comprarProduto(ECommerce ecommerce, Produto produto) {
        ecommerce.getProdutos().add(produto);
    }

    // Método credenciar transportadora
    public static void credenciarTransportadora(ECommerce ecommerce, Transportadora transportadora) {
        ecommerce.getTransportadoras().add(transportadora);
    }
}
