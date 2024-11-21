import java.util.List;

public class ProdutoComboMetodos {

    // Método sobrescrito para calcular o preço do combo
public double getPreco() {
    double precoTotal = 0.0;

    // Calculando o preço total somando os preços de todos os produtos no combo
    for (Produto produto : produtos) {
        precoTotal += produto.getPreco();
    }

    // Aplicando o desconto
    if (tipoDesconto.equals("percentual")) {
        precoTotal -= precoTotal * valorDesconto / 100;
    } else if (tipoDesconto.equals("valor")) {
        precoTotal -= valorDesconto;
    }

    return precoTotal;
}
    }

