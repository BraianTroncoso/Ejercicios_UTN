# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir numeros y meterlos en una lista, cuando el usuario
# Introduzca un numero 0, nuestro programa dejaria de insertar.
# Por último, mostrar los números ordenados de menor a mayor.

# MI SOLUCIÓN
# CREAMOS UNA LISTA VACIA
# CREAMOS UNA VARIABLE QUE VA A FUNCIONAR COMO ITERADOR
num = []
i = 1
#MIENTRAS I NO SEA 0 EL BUCLE SE VA A REPETIR AGREGANDO EL VALOR INDICADO POR USUARIO
while i != 0:
    i = int(input('Ingrese un numero: '))
    num.append(i)
num.sort()
print(num)

