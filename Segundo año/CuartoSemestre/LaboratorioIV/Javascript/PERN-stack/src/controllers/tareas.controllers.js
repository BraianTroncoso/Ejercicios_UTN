// con express-promise-router estamos manejando las excepciones de una forma gral sin tanto codigo
export const listarTareas = async (req, res, next) => {
    const resultado = await pool.query('SELECT * FROM tareas1');
    console.log(resultado);
    return res.json(resultado.rows);
};



export const listarTarea = (req, res) => res.send('obteniendo tarea unica');


export const crearTarea = async (req, res, next) => {
    const {titulo, descripcion } = req.body;


    try{ 
        const result = await pool.query('INSERT INTO tareas ( titulo, descripcion ) VALUES ($1,$2) RETURNING *',[ titulo, descripcion]);
        res.json(result.rows[0]);
        console.log(result.rows[0]);
        res.send('Creando tareas');
    }catch(error){
        if(error.code === '23505'){
            return res.send('ya existe tare con ese titulo');
        }
        console.log(error);
        next(error);
    }
}
export const actualizarTarea = (req, res) => res.send('actualizando tarea unica');

export const eliminarTarea = async (req, res) => {
    const resultado = await pool.query('DELETE FROM tareas WHERE id =$1', [req.params.id]);

    if(resultado.rowCount === 0){
        return res.status(404).json({
            message: 'No existe una tarea con ese id'
        });
    }
    return res.sendStatus(204);
};