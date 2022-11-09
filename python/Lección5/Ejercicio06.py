# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de múltiplicar hasta el 10- Por ejemplo:
# si digita el 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50



lista = []
num = int(input('Ingrese un número para saber su tabla: '))

for i in range (1,11):
   lista.append(i*num)

print(f'\nTabla de múltiplicar del {num}: \n {lista}')
for indice, i in enumerate(lista):
    print(f'{num} x {i} = {lista[indice]}') # Este ciclo es para ver en formato de tabla de múltiplicar
