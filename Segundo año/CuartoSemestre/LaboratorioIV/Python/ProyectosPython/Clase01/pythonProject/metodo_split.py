#Split: Separar - dividir

#help(str.split)

cursos = 'Java Javascript Node Python Diseno'
print(type(cursos)) # Tipo str
lista_cursos = cursos.split() # Lo convierte a tipo list
print(f'Lista de cursos: {lista_cursos}')
print(type(lista_cursos)) # Tipo list

cursos_separados_coma = "Java,Python,Node,Javascript,Sprint"
lista_cursos = cursos_separados_coma.split(',', 2) # Si no se ingresa la , como separador, split por defecto lo convertiria en 1 solo elemento
# Ya que por defecto esta el "espacio" y en el string ingresado no hay ningun espacio sino mas bien una coma.
print(f'Lista de cursos: {lista_cursos}')
print(len(lista_cursos))

