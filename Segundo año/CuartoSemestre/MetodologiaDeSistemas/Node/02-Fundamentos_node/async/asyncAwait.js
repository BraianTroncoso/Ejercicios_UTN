async function hola(nombre){ // async puede trabajar sin la necesidad de utilizar el await
    return new Promise(function (resolve, reject) {
        setTimeout(function (){
            console.log('Hola, '+nombre);
            resolve(nombre);
        },1000);
    });
   
}

function hablar(nombre){
    return new Promise((resolve,reject) =>{ // Usamos la sintaxis de ES6
        setTimeout(function (){
            console.log('bla bla bla')
            resolve(nombre);
        },1000);
    })
}

function adios(nombre){
    return new Promise((resolve, reject)=>{
        setTimeout(function(){
            console.log('Adios '+ nombre);
            // resolve();
            reject('Hay un error');
        },1500)
    })
}

// await hola('Ariel'); // Esto es una mala sintaxis, no sabe que hacer

async function main(){
    await hola('Ariel')
};

main();