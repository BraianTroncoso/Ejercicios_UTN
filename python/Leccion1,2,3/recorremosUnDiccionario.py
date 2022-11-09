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
#RECORREMOS UN DICCIONARIO DE OTRA FORMA
vuelta = 0
#DESDE EL ITERADOR RECORREMOS EL DICCIONARIO SELECCION ARGENTINA
for i in seleccionArgentina:
    #DESPUES MOSTRAMOS EL VALOR POR PANTALLA
    #DE I QUE A SU VEZ VA RECORRIENDO EL DICCIONARIO Y EN CADA VUELTA MUESTRA SU VALOR
    print(f'{i} -> {seleccionArgentina[i]}')