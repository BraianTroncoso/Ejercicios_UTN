from capa_datos_persona.Persona import Persona
from capa_datos_persona.conexion import Conexion
from capa_datos_persona.logger_base import log

class PersonaDAO:
    """
    DAO significa: Data Acces Object
    CRUD significa:
        Create -> Insertar
        Read -> Seleccionar
        Update -> Actualizar
        Delete -> Eliminar
    """

    _SELECIONAR='SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR='INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)'
    _ACTUALIZAR='UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR='DELETE FROM persona WHERE id_persona=%s'



# Definimos los métodos de clase

    @classmethod
    def selecionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECIONAR)
                registros = cursor.fetchall()
                personas = [] # Creamos una lista
                for registro in registros:
                    persona = Persona(registro[0],registro[1],registro[2],registro[3])
                    personas.append(persona)
                return personas

if __name__ == '__main__':
    personas = PersonaDAO.selecionar()
    for persona in personas:
        log.debug(persona)