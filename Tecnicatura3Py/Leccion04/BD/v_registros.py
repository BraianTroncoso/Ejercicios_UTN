import psycopg2 # Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(user='postgres',password='postgres',host='127.0.0.1',port='5432',database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s' # Placeholder
            entrada = input('Digite los id_personas a buscar (separados por coma): ')
            # Creamos una tupla de tuplas
            llaves_primarias = (tuple(entrada.split(', ')),) # Si o si poner la , al finalizar para que sea una tupla siempre
            cursor.execute(sentencia, llaves_primarias) # De esta manera ejecutamos la sentencia, le pasamos una tupla
            registros = cursor.fetchall()# Recuperamos todos los registros que serán una lista con (fetchall)
            for registro in registros:
                print(registro)

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()