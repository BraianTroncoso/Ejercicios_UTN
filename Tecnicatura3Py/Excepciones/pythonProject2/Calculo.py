class Calculo:
    def __init__(self, valor):
        self.valor = valor
        self._contado = 0

    def calcularValor(self):
        if (self.valor > 0):
            self.contado = self.valor * 10 / 100
            tres = self.valor * 30 / 100
            seis = self.valor * 50 / 100
            doce = self.valor * 60 / 100
            print("El descuento precio cdo es 10 %:", self.valor - self.contado)
            print("El interes 3 15%:", tres + self.valor,"3 pagos de $:",(tres + self.valor)/3)
            print("El interes 6 30%:", seis + self.valor,"6 pagos de $:",(seis + self.valor)/6)
            print("El interes 12 50%:", doce + self.valor,"12 pagos de $:",(doce + self.valor)/12)
        else:
            print("Ingreso no valido")


ingresar=float(input("Ingrese valor: "))
Calcular = Calculo(ingresar)
Calcular.calcularValor()


