import { Router } from "express";
import{listarTarea} from "../controllers/tareas.controllers.js";

const router = Router();

router.get('/tareas', listarTareas );
router.get('/tareas/:id', listarTarea);
router.get('/tareas', crearTarea);
router.get('/tareas/:id', actualizarTarea);
router.get('/tareas/:id', eliminarTarea);