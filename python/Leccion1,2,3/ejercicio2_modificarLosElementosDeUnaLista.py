# EJERCICIO 2: MODIFICAR LOS ELEMENTOS DE UNA LISTA
# LLENAR UNA LISTA CON LOS NUMEROS DEL 1 AL 10, LUEGO MODIFICAR LOS
# ELEMENTOS DE LA LISTA MULTPLICANDOLOS POR UN VALOR INGRESADO POR EL USUARIO

# MI SOLUCION

# CREE UNA LISTA VACIA DONDE LUEGO VOY A UTILIZAR PARA GUARDAR LOS VALORES FINALES
result = []

# LUEGO CREO OTRA LISTA DONDE ESTA TIENE LOS VALORES INGRESADOS POR RANGE DEL 1 AL 11(OSEA 10)
# DESPUES RECORRO CON EL CICLO FOR EN LA LISTA Y MUESTRO LOS VALORES ORIGINALES. 1-2-3-4...10.
lista = list(range(1, 11))
print('\nLISTA ORIGINAL')
for i in lista:
    print(i, end='-')
# LE PIDO AL USUARIO QUE DIGITE POR EL VALOR QUE DESEA MULTIPLICAR
multiplicar = int(input('\nIngrese por el valor que desea multiplicar: '))
print(f'Lista final multiplicados por {multiplicar}')
# CREO OTRO FOR Y RECORRO LA LISTA Y PASO A AGREGAR EL VALOR DEL I * MULTIPLICAR EN LA VARIABLE RESULT
for i in lista:
    result.append(i*multiplicar)
# POR ULTIMO AHORA MUESTRO POR PANTALLA RESULT DE UNA FORMA ESTETICA AGRADABLE AGREGANDO AL FINAL "end='-'"
for i in result:
    print(i, end='-')

"""
#SOLUCION PROFE
lista = list(range(1, 11))
print('Lista original')
for i in lista:
    print(i, end='-')
    
valor = int(input('\n Digite un valor a multiplicar: '))
for indice, i in enumerate(lista):
    lista[indice] *=valor
    
print(f'Lista final con los elementos multiplicados por {valor}')
for i in lista:
    print(i, end='-')
"""
