# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres


cadena = str(input('Ingrese una cadena: '))
cadenaLista = [] # CREAMOS LA LISTA VACIA
for i in cadena:  # RECORREMOS LA CADENA
    if i not in cadenaLista: # COMPROBAMOS QUE SI EL CARACTER AUN NO ESTA EN LA LISTA
        cadenaLista.append(i)


print(f'Lista de caracteres sin repetir ninguno {cadenaLista}')