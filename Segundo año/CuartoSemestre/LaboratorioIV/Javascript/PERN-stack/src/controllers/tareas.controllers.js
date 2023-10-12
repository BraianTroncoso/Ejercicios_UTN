export const listarTarea = (req, res) => res.send('obteniendo tarea unica');
export const listarTareas = (req, res) => res.send('obteniendo tareas');
export const crearTarea = (req, res) => {
    console.log(req.body);
    res.send('creando tarea');
}
export const actualizarTarea = (req, res) => res.send('actualizando tarea unica');
export const eliminarTarea = (req, res) => res.send('Eliminando tarea unica');