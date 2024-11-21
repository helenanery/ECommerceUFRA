from .item import Item

class Pedido:
    def __init__(self, data_hora, cliente, endereco, transportadora=None):
        self.data_hora = data_hora
        self.cliente = cliente
        self.endereco = endereco
        self.transportadora = transportadora
        self.itens = []
        self.subtotal = 0
        self.frete = 0
        self.total = 0

    def adicionar(self, quantidade, produto):
        for item in self.itens:
            if item.produto == produto:
                item.setQuantidade(item.quantidade + quantidade)
                self.calcularTotal()
                return
        self.itens.append(Item(quantidade, produto))
        self.calcularTotal()

    def calcularTotal(self):
        self.subtotal = sum(item.subtotal for item in self.itens)
        self.total = self.subtotal + self.frete

    def calcularFrete(self):
        if self.transportadora:
            self.frete = self.transportadora.calcularFrete(self.itens)
            self.total = self.subtotal + self.frete

    def setTransportadora(self, transportadora):
        self.transportadora = transportadora
        self.calcularFrete()

    def remover_produto(self, produto):
        item_removido = False
        for item in self.itens:
            if item.get_produto() == produto:
                self.itens.remove(item)
                item_removido = True
                break

        if item_removido:
            print("Produto removido")
            self.atualizar_totais()
        else:
            print("Não há como remover o item com o produto indicado")

    def __str__(self):
        itens_str = ", ".join(str(item) for item in self.itens)
        return f"Pedido(cliente={self.cliente.nome}, itens=[{itens_str}], total={self.total})"
