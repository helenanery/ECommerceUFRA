// Teste de Implementação

public class Main {
    public static void main(String[] args) {
        // Criando um e-commerce
        ECommerce ecommerce = new ECommerce();

        // Criando produtos
        Produto produto1 = new Produto("Livro de Java", 50.00, 0.5, 0.3);
        Produto produto2 = new Produto("Camisa UFRA", 30.00, 0.2, 0.2);

        // Adicionando produtos ao e-commerce
        MetodosECommerce.comprarProduto(ecommerce, produto1);
        MetodosECommerce.comprarProduto(ecommerce, produto2);

        // Criando cliente
        Cliente cliente = new Cliente("João", "joao@ufra.edu.br");

        // Cadastrando cliente
        MetodosECommerce.cadastrarCliente(ecommerce, cliente);

        // Criando pedido
        Pedido pedido = new Pedido("2024-11-21 12:00", 80.00, 10.00, 90.00, cliente, new Endereco("Casa", "Rua XYZ", 123, "Apto 5"), new Transportadora("Transportadora A", 2.0, 1.0, 5), List.of(new Item(1, produto1), new Item(1, produto2)));

        // Pagando o pedido (sem voucher)
        boolean pagamentoOk = MetodosECommerce.pagar(ecommerce, pedido, 90.00);
        System.out.println("Pagamento realizado com sucesso? " + pagamentoOk);

        // Pagando com voucher
        pagamentoOk = MetodosECommerce.pagar(ecommerce, pedido, 90.00, "DESCONTO10");
        System.out.println("Pagamento realizado com sucesso (com voucher)? " + pagamentoOk);
    }
}
