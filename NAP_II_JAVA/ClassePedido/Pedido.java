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

    // Construtor não padrão para inicializar todos os atributos, exceto os associados
    public Pedido(Cliente cliente, Endereco endereco, Transportadora transportadora) {
        this.dataHora = java.time.LocalDateTime.now().toString();
        this.cliente = cliente;
        this.endereco = endereco;
        this.transportadora = transportadora;
        this.listaItens = new ArrayList<>();
        calcularFrete();  // Inicializa o frete
        calcularTotal();   // Inicializa o total
    }

    // Getters
    public String getDataHora() { return dataHora; }
    public double getSubtotal() { return subtotal; }
    public double getFrete() { return frete; }
    public double getTotal() { return total; }
    public Cliente getCliente() { return cliente; }
    public Endereco getEndereco() { return endereco; }
    public Transportadora getTransportadora() { return transportadora; }
    public List<Item> getListaItens() { return listaItens; }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Pedido{" +
                "dataHora='" + dataHora + '\'' +
                ", subtotal=" + subtotal +
                ", frete=" + frete +
                ", total=" + total +
                ", cliente=" + cliente +  // Assumindo que Cliente tem toString()
                ", endereco=" + endereco +  // Assumindo que Endereco tem toString()
                ", transportadora=" + transportadora +  // Assumindo que Transportadora tem toString()
                ", listaItens=" + listaItens +
                '}';
    }
}
