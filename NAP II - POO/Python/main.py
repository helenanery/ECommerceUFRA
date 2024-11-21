from datetime import datetime

from UFRAcommerce.cliente import Cliente
from UFRAcommerce.ecommerce import ECommerce
from UFRAcommerce.endereco import Endereco
from UFRAcommerce.pedido import Pedido
from UFRAcommerce.produto import Produto
from UFRAcommerce.produto_combo import ProdutoCombo
from UFRAcommerce.transportadora import Transportadora


if __name__ == "__main__":

    produto1 = Produto("Camiseta UFRA", 50.0, 1.0, 0.5)
    produto2 = Produto("Caneca UFRA", 30.0, 0.5, 0.3)
    produto3 = Produto("Mochila UFRA", 120.0, 3.0, 1.5)
    produto4 = Produto("Agenda UFRA", 25.0, 0.3, 0.2)
    combo = ProdutoCombo("Kit UFRA", "percentual", 10, [produto1, produto2])


    cliente1 = Cliente("Ana Silva", "ana@ufra.edu.br")
    cliente2 = Cliente("Carlos Oliveira", "carlos@ufra.edu.br")


    endereco1 = Endereco("Casa Ana", "Rua A", 123)
    endereco2 = Endereco("Trabalho Ana", "Avenida B", 456, "Sala 10")
    endereco3 = Endereco("Casa Carlos", "Rua C", 789)


    transportadora1 = Transportadora("Transportadora Rápida", 5.0, 2.0, 3)
    transportadora2 = Transportadora("Transportadora Econômica", 3.0, 1.5, 7)


    pedido1 = Pedido(datetime.now(), cliente1, endereco1)
    pedido1.adicionar(2, produto1)
    pedido1.adicionar(1, produto3)
    pedido1.setTransportadora(transportadora1)

    pedido2 = Pedido(datetime.now(), cliente2, endereco3)
    pedido2.adicionar(1, combo)
    pedido2.adicionar(3, produto4)
    pedido2.setTransportadora(transportadora2)


    ufraCommerce = ECommerce()


    ufraCommerce.comprar(produto1)
    ufraCommerce.comprar(produto2)
    ufraCommerce.comprar(produto3)
    ufraCommerce.comprar(produto4)
    ufraCommerce.comprar(combo)


    ufraCommerce.cadastrar(cliente1)
    ufraCommerce.cadastrar(cliente2)


    ufraCommerce.credenciar(transportadora1)
    ufraCommerce.credenciar(transportadora2)


    ufraCommerce.pedidos.append(pedido1)
    ufraCommerce.pedidos.append(pedido2)


    print("Resumo do E-Commerce:")
    print(ufraCommerce)

    print("\nDetalhes do Pedido 1:")
    print(pedido1)

    print("\nDetalhes do Pedido 2:")
    print(pedido2)


    print("\nPagando Pedido 1...")
    if ufraCommerce.pagar(pedido1, 200):
        print("Pagamento realizado com sucesso!")
    else:
        print("Pagamento falhou. Valor insuficiente.")

    print("\nPagando Pedido 2 com voucher...")
    if ufraCommerce.pagar(pedido2, 100, "DESCONTO10"):
        print("Pagamento realizado com sucesso!")
    else:
        print("Pagamento falhou. Valor insuficiente.")
