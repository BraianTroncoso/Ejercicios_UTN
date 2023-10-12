export const listarTarea = (req, res) => res.send('obteniendo tarea unica');
export const listarTareas = (req, res) => res.send('obteniendo tareas');
export const crearTarea = (req, res) => {
    const {titulo, descripcion } = req.body;
    try{ const (rows) = await pool.query('INSERT INTO tareas ( titulo, descripcion ) VALUES ($1,$2)',[ titulo, descripcion]);
        console.log(rows)
        res.send('Creando tareas');
    }catch(error){
        console.log("Algo salio mal")
    }
}
export const actualizarTarea = (req, res) => res.send('actualizando tarea unica');
export const eliminarTarea = (req, res) => res.send('Eliminando tarea unica');