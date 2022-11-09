# Ejercicio 11: Agenda telefonica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendrá el siguiente menú de opciones:
#       1. Nuevo contacto
#       2. Borrar contacto
#       3. Ver contactos existentes
#       4. Salir
agenda = { }

nombre = ''
consulta = 0

while True:
    print(f'\n\t.*CONTACTOS*.')
    print(f'\n\t1. Nuevo contacto')
    print(f'\n\t2. Borrar contacto')
    print(f'\n\t3. Ver contactos existentes')
    print(f'\n\t4. Salir')

    opc = int(input(f'\n\tDigite una opción del menú: '))
    if opc == 1:
        nombre = input('Ingrese el nombre: ')
        telefono = int(input('Digite el número de teléfono: '))
        if nombre not in agenda: # SI NOMBRE NO ESTA EN AGENDA, SE AGREGA CLAVE Y VALOR
          agenda[nombre] = telefono
          print('Contacto agregado exitosamente')
        else:
          print('El contacto que intenta agregar, ya existe')
    elif opc == 2:
        if nombre not in agenda: #COMPROBAMOS QUE NOMBRE NO ESTA EN LA AGENDA
            print('NO HAY CONTACTOS EXISTENTES')
            continue # SE AGREGÓ UN CONTINUE PARA QUE RETORNE AL MENÚ PRINCIPAL
        if nombre in agenda:# E IGNORE LA SIGUIENTE LINEA
            print('CONTACTOS EXISTENTES')
        for clave, valor in agenda.items():
            print(f'Nombre: {clave}, Telefono: {valor}')
        nombre = input('¿Cual es el nombre del contacto?: ')
        if nombre in agenda:
            del (agenda[nombre])
            print('Se eleminado el contacto requerido')
        else:
            print('Este contacto no existe en la agenda')
    elif opc == 3:
        if nombre not in agenda: #COMPROBAMOS QUE EL NOMBRE NO ESTA EN LA AGENDA
            print('NO HAY CONTACTOS EXISTENTES')
        if nombre in agenda:
            print('AGENDA DE CONTACTOS')
        for clave, valor in agenda.items():
            print(f'Nombre: {clave}, Telefono: {valor}')

    elif opc == 4:
        print('Gracias por utilizar su agenda de contactos')
        break
    else:
        print('Se equivocó de valor')