from laboratorio_usuarios.Usuario import Usuario
from laboratorio_usuarios.conexion import Conexion
from laboratorio_usuarios.cursor_del_pool import CursorDelPool
from laboratorio_usuarios.logger_base import log
from logger_base import log

class Usuario:
    def __init__(self, id_usuario=None, username=None, password=None):
        self._id_usuario = id_usuario
        self._username = username
        self._password = password
    def __str__(self):
        return f'''
            Id Usuario: {self._id_usuario},
            Username: {self._username},
            Password: {self._password}
        '''

    
    @property
    def id_usuario(self):
        return self._id_usuario
    @id_persona.setter
    def id_usuario(self, id_usuario):
        self._id_usuario = id_usuario

    @property
    def username(self):
        return self._username
    @nombre.setter
    def username(self, username):
        self._username = username

    @property
    def password(self):
        return self._password
    @apellido.setter
    def password(self, password):
        self._password = password
    

