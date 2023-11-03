function hola(nombre){
    return new Promise(function (resolve, reject) {
        setTimeout(function (){
            console.log('Hola, '+nombre);
            resolve(nombre);
        },1000);
    });
   
}

function hablar(nombre){
    return new Promise((resolve,reject) =>{
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