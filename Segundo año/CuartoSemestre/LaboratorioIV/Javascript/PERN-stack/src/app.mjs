import express from "express";
import morgan from "morgan";

const app = express();

app.use(morgan("dev"));

app.get("/",(req,res) => res.json({ message: "Bienvenidos a mi app"}))
app.get("/test",(req,res)=> {
    res.send("test")
});


export default app;
