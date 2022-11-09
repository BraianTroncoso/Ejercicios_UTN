# EJERCICIO 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# Los nombres son los que estan en ejemplo a diferencia de 3 que son los que agrege como tarea(los ultimos).

#CREMAOS UNA LISTA VACIA
personajes = []

#CREAMOS UN DICCIONARIO DONDE SE VAN A INCLUIR LOS PERSONJAES
p = {'Nombre': 'Gandalf', 'Clase': 'Arquero', 'Raza': 'Istar'}
personajes.append(p)
#CON EL METODO APPEND AGREGAMOS CADA PERSONAJE A LA LISTA PERSONAJES
p = {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dúnadan del norte'}
personajes.append(p)
p = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(p)
p = {'Nombre': 'Frodo', 'Clase': 'Explorador', 'Raza': 'Hobbit'}
personajes.append(p)
p = {'Nombre': 'Arwen', 'Clase': 'Guerrera', 'Raza': 'Peredhil'}
personajes.append(p)
p = {'Nombre': 'Elendil', 'Clase': 'Guerrero', 'Raza': 'Dúnedain'}
personajes.append(p)
#REUTILIZAMOS LA VARIABLE P, PARA IR AGREGANDO CADA PERSONAJE Y FINALMENTE MOSTRARLOS POR PANTALLA
print(personajes)
