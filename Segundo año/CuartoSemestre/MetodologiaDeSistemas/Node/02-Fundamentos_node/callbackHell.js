function hola(nombre, miCallBack){
    setTimeout(function (){
        console.log('Hola, '+nombre);
        miCallBack(nombre);
    },1000);
}

function hablar(callbackHablar){
    setTimeout(function (){
        console.log('bla bla bla')
        callbackHablar();
    },1000);
}

function adios(nombre, otraCallback){
    setTimeout(function(){
        console.log('Adios '+ nombre);
        otraCallback();
    },1500)
}
//--Proceso Princial
console.log('Iniciando el proceso...');
hola('Ariel',function(nombre){
    adios(nombre, function(){
        console.log('Terminamos')
    })
})
// hola('Carlos',function(nombre){
//     hablar(function (){
//         hablar(function (){
//             hablar(function (){
//                 hablar(function (){
//                     hablar(function (){
//                         adios(nombre,function(){
//                             console.log('Finalizando el proceso...')
//                             adios(nombre,function(){
//                                 console.log('Finalizando el proceso...')
//                             });
//                         });
//                     });
//                 });
//             }); 
//         });
//     });
// });