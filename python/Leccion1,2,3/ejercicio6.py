print("Comprobamos que año es bisiesto")
print("")
num_option = int(input("Ingrese el año: "))
if num_option % 4 == 0 and (num_option % 100 != 0 or num_option % 400 ==0):
  print("Es bisiesto")
else:
  print("No es bisiesto")
