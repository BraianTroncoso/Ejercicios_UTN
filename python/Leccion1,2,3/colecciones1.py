#CREAMOS UNA LISTA

lista = ['caramelo', 'chocolate', 'bonbon', 'helado', 'helado', 'helado', 'bonbon']
#Inicializamos una lista vacía

lista_nueva = []
#MIENTRAS RECORREMOS LA LISTA ACCEDEMOS A CADA ELEMENTO QUE AHORA AGREGARIA AL ITERADOR "I"
for i in lista:
    if i not in lista_nueva:
        lista_nueva.append(i)
#COMPROBAMOS QUE ELEMENTO DE LA LISTA NO ESTA EN LA LISTA NUEVA, MIENTRAS NO ESTE, ESTE MISMO LO AGREGARA

#Suponga que se encuentra con un elemento repetitivo,
# por ejemplo, la segunda aparición de 'caramelo' en la lista.
# Esto no se agrega a la lista_nueva como ya está presente:
# i not in lista_nueva evalúa a False para la segunda ocurrencia de 'cupcake' y 'candy'.

print('Estos son los elementos unicos', lista_nueva)


#Otra solucion seria.

lista = ['caramelo', 'chocolate', 'bonbon', 'helado', 'helado', 'helado', 'bonbon']

#RECORREMOS LA LISTA CON NUESTRO ITERADOR
#LUEGO COMPROBAMOS CON LA FUNCION "COUNT" SI EL VALOR DEL ITERADOR ES MAYOR QUE 1 (QUE SE REPITA)
#SI ESTA MISMA ES MAYOR(SE REPITE)
#SE EJECUTA LA FUNCION REMOVE Y BORRA EL ELEMENTO REPETIDO EN I.
k = 7
j = 1


for i in lista:
    print(k)
    print(j)
    print(lista)
    if lista.count(i) > 1:
        lista.remove(i)
        k -=1
    j+=1

#print(lista)
