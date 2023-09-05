
# Bool contiene valores de True y False
# Los tipos númericos, es false para el 0 (solamente 0), true para los demas valores, pueden ser positivos o negativos.

valor = 0 # False
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 1 # True
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 0.1 # True
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 0.0 # False
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo String -> False '' Representa una cadena vacia, -> True para los demas valores.

valor = '' # False
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'Hola' # True
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

