# Ejercicio 5: Fáctorial de un número positivo
# Hacer un programa para sacar el fáctorial de un número positivo

num = int(input('Ingrese un número positivo: '))

while num < 0: # Mientras que sea negativo
    print('El valor ingresado no es positivo, ingreselo nuevamente')
    num = int(input('Ingrese un número positivo: '))

factorial = 1
for i in range(1,num+1):
    factorial *= i


print(f'\n El fáctorial del número {num} es: {factorial}')

