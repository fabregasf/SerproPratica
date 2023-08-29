/*
    Algumas implementações em nodejs e typescript
}*/

import { randomInt } from "crypto";

export class Eventos{
    constructor(){                
    }  

    
}


const comer = new Promise((resolve, reject) => { 
    const value = 2;

    if (value >= 2){
        resolve (value)
    }
    else{
        reject("Não posso comer, ainda sou bebe!")
    }
    
})

// vou entrar no then, apenas se o valor acima for >= 2
export const eventos = new Promise((resolveOut) => {
    resolveOut(
        comer.then ((data) => {
            if (data == 2) {
                console.log("idade pode começar a comer papinha")
            }
        }).catch((reason) => {    
            console.log("Deu erro: (${reason})")
        })
        
    );

});
//module.exports = {eventos, comer}
// exports.eventos = eventos



