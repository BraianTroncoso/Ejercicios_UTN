# dar formato a un string

nombre = 'Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años' % (nombre, edad)
# %s es un parametro posicional de tipoprint(mensaje_con_formato) String pero puede haber de otros tipos.

# print(mensaje_con_formato)

# Creamos una tupla

persona = ('Carla', 'Gomez', 5000.00)
mensaje_con_formato = 'Hola mi nombre es %s %s . Tu sueldo es %.2f' #% persona #Aqui le pasamos el objeto persona
#print(mensaje_con_formato %persona)
nombre = 'Juan'
edad = 19
sueldo = 3000
#mensaje_con_formato = 'Nombre {} Edad {} Sueldo {:.2f}'.format(nombre,edad,sueldo)
#print(mensaje_con_formato)
mensaje = 'Nombre {0} Edad {1} Sueldo {2}'.format(nombre,edad,sueldo)
print(mensaje)