# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# de un rango, por ejemplo:
#                   suma de números pares del 2 al 30
#                   suma = 240
# MI SOLUCION

sum = 0
for i in range(2,32):
    if i % 2 == 0:
        sum += i
print(sum)


# SOLUCIÓN DEL PROFE

a = int(input('Digite desde donde va a comenzar la suma: '))
b = int(input('Digite hasta donde quiere llegar a sumar: '))

suma = 0

for i in range(a,b):
    if i % 2 == 0:
        suma+=i

print(f'\nLa suma del total de los números pares es: {suma}')

