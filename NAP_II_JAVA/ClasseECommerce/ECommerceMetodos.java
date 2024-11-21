public class ECommerceMetodos {

    // Método para realizar o pagamento de um pedido
    public static boolean pagar(ECommerce ecommerce, Pedido pedido, double valor) {
        if (valor >= pedido.getTotal()) {
            // O valor pago é suficiente para o total do pedido
            System.out.println("Pagamento realizado com sucesso!");
            return true;
        } else {
            // O valor pago é insuficiente
            System.out.println("Valor insuficiente para o pagamento!");
            return false;
        }
    }

    // Método sobrecarregado para realizar o pagamento com voucher
    public static boolean pagar(ECommerce ecommerce, Pedido pedido, double valor, String voucher) {
        double desconto = 0.0;
        if (voucher != null && !voucher.isEmpty()) {
            desconto = 0.10; // Aplicando um desconto de 10% se o voucher for válido
        }

        double totalComDesconto = pedido.getTotal() * (1 - desconto);

        if (valor >= totalComDesconto) {
            // O valor pago é suficiente considerando o desconto
            System.out.println("Pagamento realizado com sucesso! Desconto aplicado.");
            return true;
        } else {
            // O valor pago é insuficiente
            System.out.println("Valor insuficiente para o pagamento, mesmo com o desconto!");
            return false;
        }
    }

    // Método para cadastrar um cliente
    public static void cadastrar(ECommerce ecommerce, Cliente cliente) {
        ecommerce.getClientes().add(cliente);
        System.out.println("Cliente cadastrado: " + cliente.getNome());
    }

    // Método para comprar um produto
    public static void comprar(ECommerce ecommerce, Produto produto) {
        ecommerce.getProdutos().add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    // Método para credenciar uma transportadora
    public static void credenciar(ECommerce ecommerce, Transportadora transportadora) {
        ecommerce.getTransportadoras().add(transportadora);
        System.out.println("Transportadora credenciada: " + transportadora.getNome());
    }
}
