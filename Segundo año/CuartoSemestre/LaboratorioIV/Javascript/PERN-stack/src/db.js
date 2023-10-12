import{ Pool } from "pg"

const pool = new Pool({
    port: 5432,
    host: "localhost",
    user: "postgres",
    password: "",
});

pool.on("connect", () =>{
    console.log("Conectado a la base de datos")
})