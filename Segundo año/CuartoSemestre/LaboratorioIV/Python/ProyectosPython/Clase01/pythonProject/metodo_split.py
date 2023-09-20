#Split: Separar - dividir

#help(str.split)

cursos = 'Java Javascript Node Python Diseno'
print(type(cursos)) # Tipo str
lista_cursos = cursos.split() # Lo convierte a tipo list
print(f'Lista de cursos: {lista_cursos}')
print(type(lista_cursos)) # Tipo list