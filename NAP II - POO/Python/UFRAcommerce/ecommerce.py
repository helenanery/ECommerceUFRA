class ECommerce:
    def __init__(self):
        self.produtos = []
        self.clientes = []
        self.pedidos = []
        self.transportadoras = []

    def pagar(self, pedido, valor, voucher=None):
        desconto = 0
        if voucher:
            desconto = pedido.total * 0.1
        if valor >= (pedido.total - desconto):
            return True
        return False

    def cadastrar(self, cliente):
        self.clientes.append(cliente)

    def comprar(self, produto):
        self.produtos.append(produto)

    def credenciar(self, transportadora):
        self.transportadoras.append(transportadora)

    def __str__(self):
        return f"ECommerce(produtos={len(self.produtos)}, clientes={len(self.clientes)}, pedidos={len(self.pedidos)})"
