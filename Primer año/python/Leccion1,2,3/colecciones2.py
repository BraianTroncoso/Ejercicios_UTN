# operaciones de CONJUNTOS con LISTAS
# escriba un programa que tenga 2 listas y que a continuación
# cree las siguientes listas (en las que no debe haber repiticion)

# 1 lista de palabras que aparecen en las listas
# 2 lista de plabaras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la tercera
# 4 lista de palabras que aparecen en ambas listas

#CREAMOS DOS LISTAS
lista1 = [1, 2, 3, 4, 1, 4, 1, 3, 6, 0]
lista2 = [4,2,3,7,8,9,1,2,7,7,3,4]
#LAS DOS LISTAS LAS TRANSFORMAMOS EN SET(CONJUNTO)

conjunto1 = set(lista1)
conjunto2 = set(lista2)
#CREAMOS UNA VARIABLE DONDE VAMOS A CONVERTIR LOS ELEMENTOS TIPO SETS
#EN ELEMENTOS NUEVAMENTE TIPO LISTA PERO EN EL PRIMER CASO JUNTOS

#EN LA SEGUNDA UNION, RESTAMOS LOS ELEMENTOS QUE SE REPITAN DEL OBJETO 1 AL DOS

#EN LA TERCERA UNION REALIZAMOS LO MISMO PERO INVERTIDO

#EN LA INTERSECCION(DESPUES DEL PROCESO DE ELIMINACION) VOLVEMOS A UNIRLOS Y OBTENEMOS NUEVOS DATOS
union = list(conjunto1 | conjunto2)
union1 = list(conjunto1 - conjunto2)
union2 = list(conjunto2 - conjunto1)
interseccion = (conjunto1 & conjunto2)

print(f"Union de conjunto 1 y 2: {union}")
print(f"Union de conjunto 1 restandole conjunto 2: {union1}")
print(f"Union de conjunto 2 restandole conjunto 1: {union2}")
print(f"Union de interseccion de ambos conjuntos {interseccion}")





