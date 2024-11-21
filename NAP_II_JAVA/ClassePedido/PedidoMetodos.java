public class PedidoMetodos {

    // Método para adicionar produto ao pedido
    public static void adicionar(Pedido pedido, Produto produto) {
        adicionar(pedido, 1, produto); // Chama o método sobrecarregado com quantidade 1
    }

    // Método sobrecarregado para adicionar produto com quantidade
    public static void adicionar(Pedido pedido, int quantidade, Produto produto) {
        Item itemExistente = null;
        for (Item item : pedido.getListaItens()) {
            if (item.getProduto().equals(produto)) {
                itemExistente = item;
                break;
            }
        }

        if (itemExistente != null) {
            itemExistente.setQuantidade(itemExistente.getQuantidade() + quantidade);
        } else {
            pedido.getListaItens().add(new Item(quantidade, produto));
        }

        // Atualiza o total, subtotal e frete após a adição
        pedido.calcularTotal();
        pedido.calcularFrete();
    }

    // Método para remover produto do pedido
    public static void remover(Pedido pedido, Produto produto) {
        Item itemParaRemover = null;
        for (Item item : pedido.getListaItens()) {
            if (item.getProduto().equals(produto)) {
                itemParaRemover = item;
                break;
            }
        }

        if (itemParaRemover != null) {
            pedido.getListaItens().remove(itemParaRemover);
            System.out.println("Produto removido");
        } else {
            System.out.println("Não há como remover o item com o produto indicado");
        }

        // Atualiza total e frete após a remoção
        pedido.calcularTotal();
        pedido.calcularFrete();
    }
}
