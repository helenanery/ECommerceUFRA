import java.util.List;

public class ProdutoComboMetodos {

    // Sobrescrevendo o método getPreco() da classe Produto
    public static double calcularPreco(ProdutoCombo combo) {
        double precoTotal = 0.0;
        for (Produto produto : combo.getListaProdutos()) {
            precoTotal += produto.getPreco();
        }

        // Aplicando o desconto
        if ("percentual".equalsIgnoreCase(combo.getTipoDesconto())) {
            precoTotal -= precoTotal * (combo.getValorDesconto() / 100);
        } else if ("absoluto".equalsIgnoreCase(combo.getTipoDesconto())) {
            precoTotal -= combo.getValorDesconto();
        }

        return precoTotal;
    }
}
