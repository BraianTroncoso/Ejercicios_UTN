#help(str.join)
# Join: agregar - unirse
tupla_str = ('Hola', 'Alumnos', 'Tecnicatura', 'Universitaria')
mensaje = ' '.join(tupla_str)
print(f'Mensaje: {mensaje}')
lista_cursos = ['Java','Python','Angular', 'Sprint']
mensaje = ', '.join(lista_cursos)
print(f'Mensaje: {mensaje}')

cadena = 'HolaMundo'
mensaje = '.'.join(cadena)
print(f'Mensaje: {mensaje}')

diccionario = {'Nombre': 'Juan', 'Apellido': 'Perez', 'Edad': '18'}
llaves = '-'.join(diccionario.keys())
valores = '-'.join(diccionario.values())
# Cambia a tipo cadena desde que se utiliza el .join
print(f'Llaves: {llaves}, Type: {type(llaves)}')
print(f'Valores: {valores}, Type: {type(valores)}')