class Item:
    def __init__(self, quantidade, produto):
        self.quantidade = quantidade
        self.produto = produto
        self.subtotal = self.calcularSubtotal()

    def calcularSubtotal(self):
        return self.quantidade * self.produto.preco

    def setQuantidade(self, quantidade):
        self.quantidade = quantidade
        self.subtotal = self.calcularSubtotal()

    def __str__(self):
        return f"Item(quantidade={self.quantidade}, produto={self.produto.nome}, subtotal={self.subtotal})"
