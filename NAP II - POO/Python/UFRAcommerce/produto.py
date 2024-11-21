class Produto:
    def __init__(self, nome, preco, volume, peso):
        self.nome = nome
        self.preco = preco
        self.volume = volume
        self.peso = peso

    def __str__(self):
        return f"Produto(nome={self.nome}, preco={self.preco}, volume={self.volume}, peso={self.peso})"
