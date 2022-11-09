# Ejercicio 2: Función * args para múltiplicar
# Crear una función para múltiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la múltiplicacion de todos los valores pasados como argumentos

# Mi solución
def multiplicar(*args):
    return args

print(f'La múltiplicación de los argumentos pasados es: {multiplicar(10*10)}')
# Solución del profe
def multiplicar_valor(*args):
    resultado = 1 # Se inicia en 1 porque es imposible múltiplicar por 0
    for valor in args:
        resultado *= valor
    return resultado
print(f'La múltiplicacion de los argumentos pasados es: {multiplicar_valor(10,10)}')


