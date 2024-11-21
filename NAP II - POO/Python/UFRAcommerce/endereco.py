class Endereco:
    def __init__(self, nome, logradouro, numero, complemento=""):
        self.nome = nome
        self.logradouro = logradouro
        self.numero = numero
        self.complemento = complemento

    def __str__(self):
        return f"Endereco(nome={self.nome}, logradouro={self.logradouro}, numero={self.numero}, complemento={self.complemento})"
