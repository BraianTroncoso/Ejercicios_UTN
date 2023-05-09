import psycopg2 # Esto es para poder conectarnos a Postgre
conexion = psycopg2.connect(user='postgres',password='postgres',host='127.0.0.1',port='5432',database='test_bd')
#cursor = conexion.cursor(). Comento esta linea porque vamos a estar haciendo lo mismo pero con with
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' # Placeholder
            id_persona = input('Digite un número para el id_persona: ')
            cursor.execute(sentencia, (id_persona,)) # De esta manera ejecutamos la sentencia, le pasamos una tupla
            registro = cursor.fetchone()# Recuperamos todos los registros que serán una lista con (fetchall)
            print(registro)
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()



        # [(1, 'Juan', 'Perez\n', 'jperez@mail.com\n'), (2, 'Carla', 'Gomez\n', 'kgomez@mail.com')] Nos encontramos
        # una lista con 1 tubla por cada ID dentro
#cursor.close() Lo quitamos porque with ya lo hace automaticamente


# https://www.pyscopg.org/docs/usage.html