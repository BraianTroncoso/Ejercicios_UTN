# Ejercicio 8: Menú interactivo - Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo
# inicial de 1000# y tendrá el siguiente menú de opciones:
#               1. Ingresar el dinero en la cuenta
#               2. Retirar dinero de la cuenta
#               3. Mostrar dinero disponible
#               4. Salir
ingresar = 0
retirar = 0
saldo = 1000
consulta = 0

print('\n\t..*BIENVENIDO A BBVA FRANCES*..')
print('')
print('\n\t1. Ingresar el dinero en la cuenta')
print('\n\t2. Retirar dinero de la cuenta')
print('\n\t3. Mostrar dinero disponible')
print('\n\t4. Salir')
opc = (int(input('\n\t Digite una opción deseada: ')))
while True:
    if opc == 1:
        ingresar = int(input('Ingrese el monto que desea Ingresar: '))
        saldo += ingresar
        print(f'El saldo a ingresar es {ingresar}, su saldo actual es {saldo}')
        consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))
        while consulta == 1:
            ingresar = int(input('Ingrese el monto que desea Ingresar: '))
            saldo += ingresar
            print(f'El saldo a ingresar es {ingresar}, su saldo actual es {saldo}')
            consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))
        else:
            print('RETIRE SU TARJETA POR FAVOR')
            break

# La linea 2 debe ser revisada nuevamente.
# Proyecto de cajero automatico queda frenado
    if opc == 2:
        retirar = int(input('Ingrese el monto que desea Retirar: '))
        if retirar > saldo:
            print('No se puede realizar esa operacion, excede sus limites')
            consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))
            while consulta == 1:
                retirar = int(input('Ingrese el monto que desea Retirar: '))
                if retirar < saldo:
                    saldo -= retirar
                    print(f'Usted retiró {retirar} y su saldo actual es de {saldo}')
                    consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))

        if retirar < saldo:
            saldo -= retirar
            print(f'Usted retiró {retirar} y su saldo actual es de {saldo}')
            consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))
            while consulta == 1:
                retirar = int(input('Ingrese el monto que desea Retirar: '))
                if retirar < saldo:
                    saldo -= retirar
                    print(f'Usted retiró {retirar} y su saldo actual es de {saldo}')
                    consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))

        else:
            print(f'El saldo que quiere retirar {retirar} excede su monto actual de {saldo}')
            consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))
        while consulta == 1:
            retirar = int(input('Ingrese el monto que desea Retirar: '))
            if retirar < saldo:
                saldo -= retirar
                print(f'Usted retiró {retirar} y su saldo actual es de {saldo}')
                consulta = int(input(f'¿Desea realizar otra operación? Si(1), No(2)'))

    if opc == 3:
        print(f'Su saldo disponible es {saldo}')
    elif opc == 4:
        break
    else:
        print('')
        print('ERROR al seleccionar una opcion, vuelva a intentarlo')
        print('')
        print('\n\t1. Ingresar el dinero en la cuenta')
        print('\n\t2. Retirar dinero de la cuenta')
        print('\n\t3. Mostrar dinero disponible')
        print('\n\t4. Salir')
        opc = (int(input('\n\t Digite una opción deseada: ')))
