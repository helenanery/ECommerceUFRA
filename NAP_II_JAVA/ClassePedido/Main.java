// Teste de Implementação

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Produto
        Produto produto1 = new Produto("Camiseta", 50.0, 0.2, 0.5);
        Produto produto2 = new Produto("Calça", 120.0, 0.4, 1.0);

        // Criando instâncias de Cliente, Endereco e Transportadora
        Cliente cliente = new Cliente("João Silva", "joao@email.com");
        Endereco endereco = new Endereco("Rua das Flores", "123", "São Paulo", "SP", "12345-678");
        Transportadora transportadora = new Transportadora("Transportadora XYZ", 10.0);

        // Criando um pedido
        Pedido pedido = new Pedido(cliente, endereco, transportadora);

        // Exibindo o pedido antes de adicionar itens
        System.out.println("Pedido antes de adicionar itens: " + pedido);

        // Adicionando produtos ao pedido
        PedidoMetodos.adicionar(pedido, produto1);
        PedidoMetodos.adicionar(pedido, 2, produto2);  // Adicionando 2 unidades de Calça

        // Exibindo o pedido após adicionar itens
        System.out.println("Pedido após adicionar itens: " + pedido);

        // Removendo um produto do pedido
        PedidoMetodos.remover(pedido, produto1);

        // Exibindo o pedido após remover um item
        System.out.println("Pedido após remover produto1: " + pedido);

        // Teste de atualização do frete
        Transportadora novaTransportadora = new Transportadora("Transportadora ABC", 15.0);
        PedidoMetodos.setTransportadora(pedido, novaTransportadora);
        
        // Exibindo o pedido após alteração na transportadora
        System.out.println("Pedido após alteração na transportadora: " + pedido);
    }
}

