//let persona3 = new Persona('Prueba','Pruebita'); // No se puede inicizalizar una clase(no aplica el hosting como en las funciones que si se pueden llamar y después declararse)
class Persona{
    constructor(nombre, apellido){ // Sino se define el constructor js añade uno vacio de forma automatica
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
}
let persona1 = new Persona ('Martin','Perez');
console.log(persona1.nombre);
console.log(persona1.apellido);
persona1.nombre = 'Juan Carlos';
persona1.apellido = 'Troncoso';
console.log(persona1.nombre +' '+persona1.apellido);

let persona2 = new Persona('Carlos','Lara');
persona2.nombre = 'Maria Laura'
console.log(persona2.nombre);
console.log(persona2.apellido);
persona2.nombre = 'Axel';
persona2.nombre = 'Troncoso';
console.log(persona2.nombre+' '+persona2.apellido)

