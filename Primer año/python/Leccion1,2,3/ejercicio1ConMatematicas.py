import math
#IMPORTAMOS LA LIBRERIA MATH(DE MATEMATICAS)

#Le pedimos al usuario que digite un valor positivo
numero = int(input('Digite un numero positivo: '))

# Mientras el usuario digite un valor = o menor que 0 entrara al bucle while
# Y le pedira nuevamente que digite un valor hasta que la condicion sea positivo
while numero <= 0:
    print('El valor ingresado no es positivo ->')
    numero = int(input('Digite un numero positivo nuevamente: '))

# Le mostramos por pantalla el valor ingresado y a su vez la raiz cuadrada del valor ingresado
print(f'\nLa raiz cuadrada de {numero} es: {math.sqrt(numero)}')
