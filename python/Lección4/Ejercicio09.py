# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolverá la misma frase pero sin espacios en blanco, y
# además un contador de cuantos caracteres tiene la frase
# (sin contar los espaciones en blanco)
# Ejemplo:      frase = vivir por siempre en paz
#               frase final = vivirpor siempreenpaz
#               N° de caracteres = 20
import re

frase = str(input('Ingrese una frase: '))
frase = frase.replace(" ","")
print(frase)
print(len(frase))

#frase = re.sub(r"\s+", "", frase) # Es otra opción utilizando la libreria Re