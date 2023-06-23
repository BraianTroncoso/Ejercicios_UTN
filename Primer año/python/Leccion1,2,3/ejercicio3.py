mesAño = int(input("Ingrese un mes del año: "))

if mesAño >=1 and mesAño<= 3:
  print("Estas en Verano")
elif mesAño >=4 and mesAño<=6:
  print("Estas otoño")
elif mesAño >=7 and mesAño<=9:
  print("Estas en inviero")
elif mesAño >=9 and mesAño<=12:
  print("Estas en primavera")
else:
  print("El mes ingresado no es valido") 
