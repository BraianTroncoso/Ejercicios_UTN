# EJERCICIO 1: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego mostra
# la lista con el bucle for, los elementos deben mostrarse
# de la siguiente forma:

# 1-2-3-4-5....-50


#Creamos una tupla
#Despues la convertimos en una lista
#Indicamos que queremos que nos muestre un numero del 1 al 51
#Se inicializa en 1 porque range cuenta desde 0
#Por ultimo con el metodo "end", indicamos que queremos poner un guion al final.

lista = list(range(1, 51))

for i in lista:
    print(i, end='-')


# MI FORMA
#DEFINIMOS UNA FUNCION LISTA

"""def Lista(n):
    # DENTRO DE NUESTRA FUNCION CREAMOS UNA LISTA VACIA
    lst = []
    # LUEGO CON UN BUCLE RECORREMOS CON EL ITERADOR EN EL RANGO DE N+1
    for i in range(n+1):
        # DESPUES LE ALMACENAMOS EL VALOR DE N+1 EN CADA VUELTA NUESTRA LISTA
        lst.append(i)
    return(lst)

#EL USUARIO DIGITA UN ARGUMENTO(N NUMERO) Y ESTE TOMA VALOR EN EL PARAMETRO.
print(Lista(50))"""