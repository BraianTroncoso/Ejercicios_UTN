import { Router } from "express";

import{listarTarea, listarTareas, crearTarea, actualizarTarea, eliminarTarea} from "../controllers/tareas.controllers.js";

const router = Router();

router.get('/tareas', listarTareas );
router.get('/tareas/:id', listarTarea);
router.get('/tareas', crearTarea);
router.get('/tareas/:id', actualizarTarea);
router.get('/tareas/:id', eliminarTarea);

export default router;