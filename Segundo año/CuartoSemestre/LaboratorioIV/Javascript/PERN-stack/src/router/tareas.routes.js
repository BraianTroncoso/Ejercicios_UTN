import Router  from "express-promise-router";
import{listarTarea, listarTareas, crearTarea, actualizarTarea, eliminarTarea} from "../controllers/tareas.controllers.js";

const router = Router();

router.get('/tareas', listarTareas );

router.get('/tareas/:id', listarTarea);

router.post('/tareas', crearTarea);

router.put('/tareas/:id', actualizarTarea);

router.delete('/tareas/:id', eliminarTarea);

export default router;