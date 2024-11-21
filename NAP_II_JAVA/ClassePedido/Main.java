// Teste de Implementação

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Livro de Java", 50.0, 1.2, 0.8);
        Produto produto2 = new Produto("Livro de Python", 40.0, 1.0, 0.5);
        Cliente cliente = new Cliente("Ana", "ana@gmail.com");
        Endereco endereco = new Endereco("Casa", "Rua Java", 123, "Apto 101");
        Transportadora transportadora = new Transportadora("Correios", 2.5, 3.0, 5);

        Pedido pedido = new Pedido(cliente, endereco, transportadora);

        // Adicionar produtos
        PedidoMetodos.adicionar(pedido, produto1); // Adiciona 1 unidade do produto
        PedidoMetodos.adicionar(pedido, 2, produto2); // Adiciona 2 unidades do produto2

        // Remover um produto
        PedidoMetodos.remover(pedido, produto1);

        // Exibe os totais
        System.out.println("Subtotal: " + pedido.getSubtotal());
        System.out.println("Frete: " + pedido.getFrete());
        System.out.println("Total: " + pedido.getTotal());
    }
}
