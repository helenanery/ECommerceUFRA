import java.util.List;

public class Pedido {
    private String dataHora;
    private double subtotal;
    private double frete;
    private double total;
    private Cliente cliente;
    private Endereco endereco;
    private Transportadora transportadora;
    private List<Item> itens;

    // Construtor padrão
    public Pedido(String dataHora, Cliente cliente, Endereco endereco, Transportadora transportadora, List<Item> itens) {
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.endereco = endereco;
        this.transportadora = transportadora;
        this.itens = itens;
        calcularSubtotal();
        calcularFrete();
        calcularTotal();
    }

    // Método para calcular subtotal
    private void calcularSubtotal() {
        subtotal = 0;
        for (Item item : itens) {
            subtotal += item.calcularSubtotal();
        }
    }

    // Método para calcular frete
    private void calcularFrete() {
        frete = transportadora.calcularFrete(itens);
    }

    // Método para calcular total
    private void calcularTotal() {
        total = subtotal + frete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("==== Detalhes do Pedido ====\nData e Hora: %s\n", dataHora));
        sb.append(String.format("Cliente: %s\nEndereço de Entrega: %s\n", cliente, endereco));
        sb.append(String.format("Transportadora: %s\n\nItens do Pedido:\n", transportadora));
        for (Item item : itens) {
            sb.append(item).append("\n");
        }
        sb.append(String.format("\nSubtotal: R$ %.2f\nFrete: R$ %.2f\nTotal: R$ %.2f\n", subtotal, frete, total));
        return sb.toString();
    }
}
