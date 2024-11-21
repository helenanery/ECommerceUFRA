from .produto import Produto

class ProdutoCombo(Produto):
    def __init__(self, nome, tipo_desconto, valor_desconto, produtos):
        super().__init__(nome, preco=0, volume=0, peso=0)
        self.tipo_desconto = tipo_desconto
        self.valor_desconto = valor_desconto
        self.produtos = produtos

    def getPreco(self):
        total = sum(produto.preco for produto in self.produtos)
        if self.tipo_desconto == "absoluto":
            return max(0, total - self.valor_desconto)
        elif self.tipo_desconto == "percentual":
            return total * (1 - self.valor_desconto / 100)
        return total

    def __str__(self):
        return f"ProdutoCombo(nome={self.nome}, produtos=[{', '.join(p.nome for p in self.produtos)}], preco={self.getPreco()})"
