class Persona{
    constructor(nombre, apellido){ // Sino se define el constructor js añade uno vacio de forma automatica
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
let persona1 = new Persona ('Martin','Perez');
console.log(persona1);
let persona2 = new Persona('Carlos','Lara');
console.log(persona2);