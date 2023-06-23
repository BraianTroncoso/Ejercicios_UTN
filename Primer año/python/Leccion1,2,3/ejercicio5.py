usuario = int(input("Ingrese un valor de 0 a 10: "))
nota = None
if usuario == 9 or 10:
  nota = "A"
  print(f"Su califación es de: {nota}")
elif usuario == 8 or usuario < 9:
  nota = "B"
  print(f"Su califación es de: {nota}")
elif usuario == 7 or usuario < 8:
  nota = "C"
  print(f"Su califación es de: {nota}")
elif usuario == 6 or usuario < 7:
  nota = "D"
  print(f"Su califación es de: {nota}")
elif usuario == 0 or usuario < 6:
  nota = "F"
  print(f"Su califación es de: {nota}")
else:
  print("El valor ingresado es incorrecto.")