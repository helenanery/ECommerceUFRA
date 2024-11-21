// Teste de Implementação

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando produtos individuais
        Produto produto1 = new Produto("Produto A", 50.0, 1.0, 0.5);
        Produto produto2 = new Produto("Produto B", 30.0, 1.0, 0.5);

        // Adicionando produtos ao combo
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        // Criando um combo com desconto percentual de 10%
        ProdutoCombo combo = new ProdutoCombo("Combo A", 0.0, 0.0, 0.0, "percentual", 10.0, listaProdutos);

        // Exibindo o preço do combo (com desconto)
        System.out.println("Preço do Combo com Desconto: R$ " + ProdutoComboMetodos.calcularPreco(combo));

        // Criando um combo com desconto absoluto de 20
        ProdutoCombo combo2 = new ProdutoCombo("Combo B", 0.0, 0.0, 0.0, "absoluto", 20.0, listaProdutos);
        System.out.println("Preço do Combo com Desconto Absoluto: R$ " + ProdutoComboMetodos.calcularPreco(combo2));
    }
}
