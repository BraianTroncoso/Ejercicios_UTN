"""
# CLASE 1

# miVaraiable = 3
# print(miVaraiable)
# miVaraiable = 'Hola a todos los estudiantes'
# print(miVaraiable)
# miVaraiable = 3.5
# print(miVaraiable)
# x = 10
# y = 2
# z = x + y
# print(id(x))
#
# #ID
#
# print(id(y))
# print(id(z))
# ----------------------------------------------
# print('Hola mundo')
# ----------------------------------------------

# CLASE 2

# Dirección de memoria y variables

# miVariable = 3
# print(miVariable)
# miVariable = 'Hola a todos los estudiantes de la tecnicuatura'
# print(miVariable)
# miVariable = 3.5
# print(miVariable)
# x = 10
# y = 2
# z = x + y
# print(id(x))
# print(id(y))
# print(id(z))
# # Si redefino la direccion cambia
# x = 89
# print(id(x))

# CLASE 3

# rta = input('¿Cómo estuvo tu día?: ')

# print(f'Mi día estuvo de: {rta}')

# titulo = input('Proporciona el título: ')
# autor = input('Proporciona el autor: ')
# print(f'{titulo} fue escrito por {autor}')

# CLASE 4

#SUMA
# operandoA = 8
# operandoB = 5
# suma = operandoA + operandoB
# print(f'El resultado de la suma es {suma}')

# RESTA
# operandoA = 8
# operandoB = 5
# resta = operandoA - operandoB
# print(f'El resultado de la resta es {resta}')

# MULTIPLICACION
# operandoA = 2
# operandoB = 3
# multiplicacion = operandoA * operandoB
# print(f'El resultado de la multiplicacion es {multiplicacion}')

# DIVISION
# operandoA = 123
# operandoB = 12

# division = operandoA / operandoB
# print(f'El resultado de la division es {division}')
# divisionEntera = operandoA // operandoB
# print(f'El resultado de la division entera es {divisionEntera}')
# modulo = operandoA % operandoB
# print(f'El resultado del modulo es {modulo}')
# exponente = operandoA ** operandoB
# print(f'El resultado del exponente es {exponente}')

# PARIDAD
# a = int(input('Ingrese un numero: '))
# pariadad = a % 2 == 0
# if pariadad:
#     print(f'{a} es par')
# else:
#     print(f'{a} es impar')

# OPERADORES
# miVar *= 7
# miVar /= 3.4
# print(miVar)
#
# # Operadores COMPARACION
# # <=, >= , <, > ,== , !=
#
# miVar = 6 <= 3
# print('MENOR O IGUAL', miVar)
# miVar = 6 >= 4
# print('MAYOR O IGUAL', miVar)
# miVar = 6 < 5
# print('MENOR', miVar)
# miVar =  66 > 41
# print('MAYOR', miVar)
# miVar = 63 == 5
# print('IGUALDAD', miVar)
# miVar = 34 != 34
# print('DISTINTO', miVar)

# alto = int(input('Ingrese alto rectangulo: '))
# ancho = int(input('Ingrese ancho rectangulo: '))
#
# area = alto * ancho
# perimetro = 2*alto + 2*ancho
#
# print(f'El rectangulo con {alto} de alto y {ancho} de alto tiene un perimetro de {perimetro} y un area de {area}')

# ---------------------------------------------------------------------

# edadAdulto = 18
#
# edadPersona = int(input('Digite su edad: '))
# if edadPersona >= edadAdulto:
#     print(f'Su edad es : {edadPersona} años, usted es mayor de edad.')
# else:
#     print(f'Su edad es : {edadPersona} años, usted es menor de edad.')


#       CLASE 5

# RANGO EDAD
# edad = int(input('Ingrese su edad: '))
#
# en_20 = 20 <= edad < 30
# en_30 = 30 <= edad < 40
#
#
# if en_20 or en_30:
#     print("Esta en el rango")
# else:
#     print(f'No esta en el rango')
#-----------------------------------------------------------------
# num1 = int(input('Ingrese primer numero: '))
# num2 = int(input('Ingrese segundo numero: '))
#
# mayor = num1 if num1 > num2 else num2
#
# print(f'El mayor es {mayor}')

#-----------------------------------------------------------------
# vacaciones = True
# diaDescanso = True
#
# if not (vacaciones or diaDescanso):
#     print('Puede asistir al juego')
# else:
#     print('Tiene trabajo que hacer')
#
# # -----------------------------------------------------------------
# # Operadores LOGICOS
# # and, or , not
#
# miVar = 6 <= 3 and 5.4 == 5
# print('6 <= 3 and 5.4 == 5', miVar)
# miVar = 54 == 2 or 3.2 < 3.222
# print('54 == 2 or 3.2 < 3.222', miVar)
# miVar = not 4 <= 12
# print('not 4 <= 12 ', miVar)

#-----------------------------------------------------------------
# edad = 25
#
# if (20 <= edad < 30) or (30 <= edad <40):
#     print('Estas dentro del rango de los (20) a (30) años')
# else:
#     print('No estas dentro del rango de los (20) a (30) años')
#
# -------------------------------------------------------
# print('Ingrese los siguientes datos del libro')
# nombre = input('Ingrese nombre del libro: ')
# id = input('Ingrese ID del libro: ')
# precio = float(input('Ingrese precio del libro: '))
# envioGratuito = input('Indicar si el envio es gratuito (True/False)')
#
# if envioGratuito == 'True' or envioGratuito == 'T':
#     envioGratuito = True
# elif envioGratuito == 'False' or envioGratuito == 'F':
#     envioGratuito = False
# else:
#     envioGratuito = 'El valor ingresado es incorrecto'
#
# print(f'''
# Nombre : {nombre}
# Id : {id}
# Precio : {precio}
# Envio Gratuito: {envioGratuito}
# ''')

# -------------------------------------------------------------------
# MIN = 0
# MAX = 5
#
# num = int(input('Ingrese un numero: '))
#
# dentro_de_rango = MIN <= num <= MAX
#
# if dentro_de_rango:
#     print(f'{num} esta en el rango de 0 - 5')
# else:
#     print(f'{num} no esta en el rango  de 0 - 5')
# -------------------------------------------------------------------

# CLASE 6
# cond = True
# rta = ('Condicion Verdadera') if cond else ('Condicion Falsa')
# print(rta)
# -------------------------------------------------------------------
# num = int(input('Ingrese un numero: '))
# numText = ''
# if num == 1:
#     numText = 'Numero Uno'
# elif num == 2:
#     numText = 'Numero Dos'
# elif num == 3:
#     numText = 'Numero tres'
# else:
#     numText = 'Has ingresado un numero fura de rango'
# print(f'El numero ingresado es: {num} - {numText}')
# -------------------------------------------------------------------
# condicion = 'hola'
# if condicion == True:
#     print('Condicion Verdadera')
# elif condicion == False:
#     print('Condicón falsa')
# else:
#     print('Condicion sin especificar')
# -------------------------------------------------------------------
# a = float(input('Ingrese el valor de a: '))
# b = float(input('Ingrese el valor de b: '))
# c = float(input('Ingrese el valor de c: '))
# resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
# print(f'El resultado es: {resultado}')
# -------------------------------------------------------------------
# CLASE 7

# mes = 0
# while mes < 1 or mes > 12:
#     mes = int(input("Ingrese un mes: [1-12]: "))
# if mes == 1 or mes == 2 or mes == 3:
#     print("Verano")
# elif mes == 4 or mes == 5 or mes == 6:
#     print("Otoño")
# elif mes == 7 or mes == 8 or mes == 9:
#     print("Invierno")
# else:
#     print("Primavera")

# -------------------------------------------------------------------
# edad = None
# while edad is None or edad < 0:
#     edad = int(input("Ingrese su edad: "))
# if 0 < edad <=10:
#     print("La infancia es increbíle y bella")
# elif 10 < edad <= 19:
#     print()
# -------------------------------------------------------------------
# Ingresamos la nota
# nota = int(input('Ingrese la nota del alumno: '))
# if 9 <= nota <= 10:
#     print('A')
# elif 8 <= nota < 9:
#     print('B')
# elif 7 <= nota < 8:
#     print('C')
# elif 6 <= nota < 7:
#     print('D')
# elif 0 <= nota < 6:
#     print('F')
# else:
#     print('Valor incorrecto.')
# -------------------------------------------------------------------
# CLASE 8
# -------------------------------------------------------------------
# cadena = 'hola'
# for letra in cadena:
#     print(letra)
# else:
#     print('Fin del ciclo')
# -------------------------------------------------------------------
# max = 5
# contador = 0
# while contador <= max:
#     print(contador)
#     contador += 1
# min = 1
# contador = 5
# while contador >= min:
#     print(contador)
#     contador -= 1
# -------------------------------------------------------------------
# for i in range(9):
#     if i % 2 != 0:
#         continue
#     print(f'Valor : {i}')
# -------------------------------------------------------------------
# contador = 0
# while contador < 78:
#     print('Dentro del ciclo while: ', contador)
#     contador += 1
# else:
#     print('Fin del ciclo')
# -------------------------------------------------------------------
# for letra in 'Argentina':
#     if letra == 'a':
#         print(f'Letra encontrada: {letra}')
#         break
# else:
#     print(f'Fin del ciclo ')
# -------------------------------------------------------------------
# CLASE 9
# -------------------------------------------------------------------
# print('Comprobamos que el año sea bisiesto')
#
# year = int(input('Ingrese el año: '))
#
# if (year % 4 == 0) and (year % 100 != 0) or (year % 400 == 0):
#     print(f'El año {year} es bisiesto')
# else:
#     print(f'El año {year} no es bisiesto')
# -------------------------------------------------------------------
# numeros = int(input('Ingrese la cantidad de numeros a sumar: '))
# suma = 0
# for i in range(1, numeros+1):
#     suma += i
# print(f'La suma es {suma}')
# -------------------------------------------------------------------
# positivos , negativos, neutros = 0
# for i in range(10):
#     n = int(('Ingrese un numero: '))
#     if n == 0:
#         neutros += 1
#     elif n < 0:
#         negativos += 1
#     else:
#         positivos += 1
# print(f'Hay {positivos} numeros positivos')
# print(f'Hay {negativos} numeros negativos')
# print(f'Hay {neutros} numeros neutros')
# -------------------------------------------------------------------
""""""suma = 0
calificacion_mas_baja = 99999999
catidad_alumnos = 10
for i in range(catidad_alumnos):
    nota = int(input('Ingrese una nota: '))
    suma += nota
    if nota < calificacion_mas_baja:
        calificacion_mas_baja = nota
prom = suma / catidad_alumnos
print(f'Calificacion promedio : {prom}')
print(f'Calificacion mas baja : {calificacion_mas_baja}')"""
"""
#COLECCIONES

#DEFINIMOS UNA LISTA
Practicamos Listas lista=['juan',25,true,'carla)

nombres = ['Braian', 'Lauti', 'Javi', 'Mia', 'Paula', 'Nico']
print(nombres)
print(nombres[ :3])
print(nombres[1: ])
nombres[0] = 'Axel'
nombres[2] = 'Roger'
print(nombres)

for nombre in nombres:
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

print(len(nombres), 'Soy una longitud')
nombres.append('Maria')
print(nombres)
nombres.insert(1, 'Valeria')
print(nombres)
nombres.insert(3, 'Jony')
print(nombres)
nombres.remove('Jony')
print(nombres)
nombres.pop()
print(nombres)
nombres.pop(0)
print(nombres)
nombres.pop(0)
print(nombres)
nombres.pop(4)
print(nombres)
del nombres[3]
print(nombres)
nombres.clear()
print(nombres)
del nombres
print(nombres)
#EJERCICIO DE RANGO
print(list(range(3, 11, 2)), 'Prueba con listas')

for i in range(0, 11, 3):
    print(i)

print(list(range(2, 7)), 'Prueba con listas')

for i in range(2, 7):
    print(i)
else:
    print('Aca termina el bucle')

for i in range(11):
    if i % 3 == 0:
        print(i)
    else:
        print('Aca termina el otro bucle')

for i in range(3, 11, 2):
    print(i)

------------------------------------------------------------------------------    
#Definimos una tupla

cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

#Para acceder a un elemento se usa corchetes

print(cocina[0])
print(cocina[-1])

#Como acceder a un rango

print(cocina[0:2])

#Ejemplo

verduras = ('papa',) #Una tupla necesita aunque sea de un elemento la: coma,
# de lo contrario solo seria un Tipo String.

"""



"""

#----------------------------------------------------
# Repaso de set o conjunto
# Para definir un conjunto

conjunto2 = set()
conjunto1 = {'bye'}
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1) # PREGUNTAMOS SI EL NÚMERO 3 NO ESTA EN EL CONJUNTO O SET 1

if (2 in conjunto2):
    print('Si esta el valor indicado en este SET')   # PREGUNTAMOS SI EL VALOR 7 SE ENCUENTRA EN CONJUNTO2
else:print('No esta el valor indicado en este SET')


# Como hacer la igualdad de dos conjuntos

print(conjunto1 == conjunto2) # Nos devuelve como respuesta un boolean

# Operaciones en conjuntos

conjunto3 = conjunto1 | conjunto2  # La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 # Que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que esta en el conjunto1 y no en el conjunto2
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 # Elementos no compartidos entre los conjuntos o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) # Aqui preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1)) # Preguntamos si los elementos del conjunto1 estan dentro del 3
print(conjunto3.issuperset(conjunto2)) # Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

# Como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2)) #Recordemos que los conjuntos/set no son ni totalmente mutables
                                        #Ni totalmente inmutable
# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset # Esto hace que el conjunto sea totalmente inmutable
# No se puede agregar, modificar ni eliminar elementos del conjunto

#--------------------------------------------------------------------------------------------------
# 3.3 EJERCICIO CON DICCIONARIO Y TAREA.


seleccionArgentina = {
    10:{'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 millones', 'Posicion':'Extremo Derecho'},
    11:{'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 millones', 'Posicion':'Extremo Derecho'},
    21:{'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 millones', 'Posicion':'Media Punta'},
    19:{'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 millones', 'Posicion':'Defensa Central'},
    1:{'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.80, 'Precio': '3.5 millones', 'Posicion':'Portero'},
    #INGRESAMOS JUGADORES DE TAREA
    24:{'Nombre': 'Alejandro Darío Gómez', 'Edad': 34, 'Altura': 1.67, 'Precio': '7.5 millones', 'Posicion':'Centro Campista'},
    23:{'Nombre': 'Damián Emiliano Martínez', 'Edad': 29, 'Altura': 1.95, 'Precio': '28 millones', 'Posicion':'Portero'},
    22:{'Nombre': 'Lautaro Martínez', 'Edad': 25, 'Altura': 1.74, 'Precio': '106 millones', 'Posicion':'Delantero'},
    27:{'Nombre': 'Julián Álvarez', 'Edad': 22, 'Altura': 1.73, 'Precio': '21.4 millones', 'Posicion':'Delantero'}

}
for llave,valor in seleccionArgentina.items():
    print(llave,valor)
# Como tarea agregar por lo menos 4 jugadores mas al diccionario: seleccionArgentina
print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))

#------------------------------------------------------------------------------------------------
# PILAS USANDO LISTAS
pila = [1, 2, 3]

# Agregar elementos a la pila por el final

pila.append(4)
pila.append(5)
print(pila)

# Sacando elementos desde el final

elementoBorrado = pila.pop()         # Quita el ultimo elemento y lo guarda en la variable
print(f'Sacamos el elemento borrado: {elementoBorrado}')
print(f'La pila ahora quedo asi:{pila}')
#--------------------------------------------------------------------------------------------------

# Colas con listas
# Estructura de datos de tipo fifo(first input / first output)(Primero en entrar, primero en salir)

cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

# Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('José')
print(cola)
# Sacamos elementos de la cola

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)
#---------------------------------------------------------------------------------------
#EJERCICIO 1 COLECCIONES

#CREAMOS UNA LISTA

lista = ['caramelo', 'chocolate', 'bonbon', 'helado', 'helado', 'helado', 'bonbon']
#Inicializamos una lista vacía

lista_nueva = []
#MIENTRAS RECORREMOS LA LISTA ACCEDEMOS A CADA ELEMENTO QUE AHORA AGREGARIA AL ITERADOR "I"
for i in lista:
    if i not in lista_nueva:
        lista_nueva.append(i)
#COMPROBAMOS QUE ELEMENTO DE LA LISTA NO ESTA EN LA LISTA NUEVA, MIENTRAS NO ESTE, ESTE MISMO LO AGREGARA

#Suponga que se encuentra con un elemento repetitivo,
# por ejemplo, la segunda aparición de 'caramelo' en la lista.
# Esto no se agrega a la lista_nueva como ya está presente:
# i not in lista_nueva evalúa a False para la segunda ocurrencia de 'cupcake' y 'candy'.

print('Estos son los elementos unicos', lista_nueva)
"""
