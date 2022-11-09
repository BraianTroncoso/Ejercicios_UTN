# Comenzamos con Funciones
# mi_funcion() # No se puede llamar antes de definir a una función
# Definimos una función

def mi_funcion(): # Para identificar a la función utilizamos paréntesis
    print('Saludos a todos los alumnos de la Tecnicatura')

mi_funcion() # Estamos llamando a la función.
mi_funcion() # Se puede llamar N cantidad de veces.
mi_funcion()

# Desempaquetado de listas o list Unpacking

def show(name, lastName):
    print(name+' '+lastName)
person = ['Ariel', 'Betancud']
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la función
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ('Osvaldo', 'Giordanini') # Desempaquetamos a través de una tupla
show(*person2)
person3 = {'lastname': 'Lucero', 'name': 'Natalia'} # Desempaquetamos a través de un diccionario
show(**person3)


numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
    if n == 3: # Esta es la unica manera para que no se ejecute el else
        break
else:
    print('Esto se terminó')

# List comprehension, lista comprensión
names = ['Paolo', 'Rodrigo', 'Lupe', 'Pepe']
alongP = [p for p in names if p[0] == 'P'] # Esto regresa una nueva lista
print(alongP)

battleC = [{'Name': 'Quilmes', 'country': 'Arg'},
           {'Name': 'Corona', 'country': 'Arg'},
           {'Name': 'Stella Artois', 'country': 'Belgium'},]
arg = [i for i in battleC if i['country'] == 'Arg'] #Tiene que ser con exactitud el nombre
print(arg, 'Soy un diccionario sólo con Argentina')
print(battleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):
    print('Saludos a todos a través del canal de Youtube')
    print(f'Nombre: {name}, Apellido {lastName}')

mi_funcion2('Braian', 'Troncoso')
mi_funcion2('Javier', 'Troncoso')
mi_funcion2('Lautaro', 'Troncoso')

def sumar (a,b):
    return a + b

resultado = sumar(78, 22)
#print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(78,22)}') #Llamamos a la función dentro del print

# Es recomendable darle un valor por defecto a las funciones
def sumar2 (a = 0, b = 0): # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es:{sumar2(78,22)}')

# Argumentos, variables en funciones

def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en tuplas
        print(nombre)
listarNombres('Brian', 'Javier', 'Lauti','mia', 'Carla')
listarNombres('Venom', 'Valeria', 'Paula')

def listaTerminos(**terminos): # Lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # kwars significa: key word argument
        print(f'{llave} : {valor}')

listaTerminos() # No recibe nada, nada se va a mostrar.
listaTerminos(IDE='Integrated Develoment Enviroment', PK='Primary Key')
listaTerminos(Nombre='Lionel Messi', Nombre1='Cristiano Ronaldo') # NO se puede repetir la llave.

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)

nombre2 = ['Cristian','Pedro','Carlos']
desplegarNombres(nombre2)
desplegarNombres('Carla')
# desplegarNombres(10,11) # No es un objeto iterable
desplegarNombres((10, 11)) # La convertimos a una tupla, en un solo elemento no olvidar la coma
desplegarNombres([22, 55]) # La converitmos en una lista
# Funciones Recursivas

def factorial(numero):
    if numero == 0: # Caso Base
        return 1
    else:
        return numero * factorial(numero-1) # Caso Rercursivo
ingresar = int(input('Ingrese un número para calcular su factorial: '))

resultado = factorial(ingresar) # Lo hacemos en código duro
print(f'El factorial del número 5 es: {resultado}')
ingresar2 = int(input('Digite el num: '))
def recursiva(ingresar2):
    if ingresar2 == 0:
        return 1
    else:
        return ingresar2 + factorial(ingresar2-1)

