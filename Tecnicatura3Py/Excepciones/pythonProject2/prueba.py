
def calculo():
    try:
        v=float(input("Ingrese valor:"))
        if (v > 0):
            cdo= v * 10 /100
            tres= v * 30 /100
            seis= v * 50 /100
            doce=v * 60 /100
            print("El descuento precio cdo es 10 %:",v - cdo)
            print("El interes 3 15%:",tres + v , "3 pagos de $:",(tres + v )/3)
            print("El interes 6 30%:",seis + v , "6 pagos de $:",(seis + v) /6)
            print("El interes 12 50%:",doce + v, "12 pagos de $:",(doce + v)/12)
            calculo()
        else:
            print("Error no valido, saliendo del programa...")
            return
    except Exception:
        print("Ingrese un valor valido: ")
        calculo()
    else:
        print("No se ejecutó ninguna excepcion")
calculo()
