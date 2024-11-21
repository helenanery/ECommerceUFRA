import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Produto A", 100.0, 1.5, 2.0);
        Produto produto2 = new Produto("Produto B", 50.0, 0.7, 1.2);

        // Criando itens com os produtos
        Item item1 = new Item(produto1, 2);
        Item item2 = new Item(produto2, 3);

        // Criando cliente
        Cliente cliente = new Cliente("João", "joao@email.com", "123456789");

        // Criando endereço
        Endereco endereco = new Endereco("Rua X", "123", "Apto 4", "São Paulo");

        // Criando transportadora
        Transportadora transportadora = new Transportadora("Transportadora A", 10.0, 5.0, 3);

        // Criando pedido
        Pedido pedido = new Pedido("2024-11-20 10:00", cliente, endereco, transportadora, List.of(item1, item2));

        // Exibindo detalhes do pedido
        System.out.println(pedido);
    }
}
