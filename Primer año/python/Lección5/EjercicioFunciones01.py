# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parametro de la
# Funcion y agregar como resultado la suma de todos los valores pasados
# como argumentos
# Definidos una función

#Cuandp no queremos dejar nada declarado usamos la funcion pass para que ignore y se ejecute igual.
# SOLUCIÓN PROFE ARIEL
def sumar_valor(*args):

    resultado = 0

    # Iteramos elementos
    for valor in args:
        resultado += valor
    return resultado
print(sumar_valor(3,5,9,2,1))

# MI SOLUCIÓN
def sumar(*args):
    return args
print(f'El resultado de la suma es: {sumar(20+20)}')