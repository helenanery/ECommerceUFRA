class Transportadora:
    def __init__(self, nome, preco_por_volume, preco_por_peso, prazo_entrega):
        self.nome = nome
        self.preco_por_volume = preco_por_volume
        self.preco_por_peso = preco_por_peso
        self.prazo_entrega = prazo_entrega

    def calcularFrete(self, itens):
        frete_total = 0
        for item in itens:
            custo_por_volume = item.produto.volume * self.preco_por_volume * item.quantidade
            custo_por_peso = item.produto.peso * self.preco_por_peso * item.quantidade
            frete_total += max(custo_por_volume, custo_por_peso)
        return frete_total

    def __str__(self):
        return f"Transportadora(nome={self.nome}, preco_por_volume={self.preco_por_volume}, preco_por_peso={self.preco_por_peso})"
