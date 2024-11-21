import java.util.List;

public class Pedido {
    private double total;
    private Cliente cliente;
    private List<Item> itens;

    public Pedido(double total, Cliente cliente, List<Item> itens) {
        this.total = total;
        this.cliente = cliente;
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "total=" + total +
                ", cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}
