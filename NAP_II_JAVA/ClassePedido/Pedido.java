import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String dataHora;
    private double subtotal;
    private double frete;
    private double total;
    private Cliente cliente;
    private Endereco endereco;
    private Transportadora transportadora;
    private List<Item> listaItens;

    public Pedido(Cliente cliente, Endereco endereco, Transportadora transportadora) {
        this.dataHora = java.time.LocalDateTime.now().toString(); // Data e hora do pedido
        this.cliente = cliente;
        this.endereco = endereco;
        this.transportadora = transportadora;
        this.listaItens = new ArrayList<>();
        calcularFrete(); // Inicializa o frete ao criar o pedido
        calcularTotal(); // Inicializa o total do pedido ao criar
    }

    public String getDataHora() {
        return dataHora;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getFrete() {
        return frete;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    // Métodos para calcular o total e o frete
    public void calcularTotal() {
        this.subtotal = 0.0;
        for (Item item : listaItens) {
            subtotal += item.getSubtotal();
        }
        total = subtotal + frete;
    }

    public void calcularFrete() {
        if (transportadora != null) {
            frete = transportadora.calcularPrecoFrete(this);
        } else {
            frete = 0.0;
        }
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
        calcularFrete(); // Atualiza o valor do frete ao modificar a transportadora
    }
}
