import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Laptop", 2000.0, 0.3, 2.5);
        Produto produto2 = new Produto("Smartphone", 1500.0, 0.2, 0.5);
        Produto produto3 = new Produto("Mouse", 100.0, 0.05, 0.1);

        // Criando o ProdutoCombo com desconto percentual
        ProdutoCombo produtoCombo = new ProdutoCombo(List.of(produto1, produto2, produto3), "percentual", 10.0);

        // Exibindo o preço do combo
        System.out.println("Preço do combo (desconto de 10%): " + produtoCombo.getPreco());

        // Criando itens
        Item item1 = new Item(2, produto1);  // 2 unidades do Laptop
        Item item2 = new Item(3, produto2);  // 3 unidades do Smartphone

        // Exibindo subtotal dos itens
        System.out.println("Subtotal do item1 (Laptop): " + item1.getSubtotal());
        System.out.println("Subtotal do item2 (Smartphone): " + item2.getSubtotal());

        // Alterando a quantidade do item1 e recalculando o subtotal
        item1.setQuantidade(3);
        System.out.println("Subtotal do item1 após alterar a quantidade: " + item1.getSubtotal());
    }
}
