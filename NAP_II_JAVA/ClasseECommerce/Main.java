// Teste de Implementação

public class Main {
    public static void main(String[] args) {
        // Criando instâncias
        Produto produto1 = new Produto("Laptop", 2000.0, 0.3, 2.5);
        Produto produto2 = new Produto("Smartphone", 1500.0, 0.2, 0.5);
        Cliente cliente = new Cliente("Ana Souza", "ana@email.com");
        Transportadora transportadora = new Transportadora("Logistica Rápida", 20.0);

        // Criando e-commerce
        ECommerce ecommerce = new ECommerce();

        // Cadastrando cliente
        ECommerceMetodos.cadastrar(ecommerce, cliente);

        // Adicionando produtos ao e-commerce
        ECommerceMetodos.comprar(ecommerce, produto1);
        ECommerceMetodos.comprar(ecommerce, produto2);

        // Credenciando transportadora
        ECommerceMetodos.credenciar(ecommerce, transportadora);

        // Criando pedido
        Pedido pedido = new Pedido(3500.0, cliente, List.of(new Item(1, produto1), new Item(1, produto2)));

        // Realizando pagamento sem voucher
        ECommerceMetodos.pagar(ecommerce, pedido, 3500.0);

        // Realizando pagamento com voucher
        ECommerceMetodos.pagar(ecommerce, pedido, 3150.0, "DESCONTO10");
    }
}
