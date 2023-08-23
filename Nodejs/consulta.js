var express = require('express');

const dados = require('./data.js');
const middlewr = require('./middleware.js');
const minhaapp = express()
const port = process.env.port || 5501;

minhaapp.listen( port, () => {
    console.log ("Servidor iniciado na porta: "+port);
})

minhaapp.get("/", function (req, res, next){
    res.send(dados); 

});

// use o next apenas para comunicação entre 2 middleswares
minhaapp.get("/:nome", function (req, res){   
    res.send('entrou aqui'+req.params.nome);
    
    /*var name = req.params.nome;
    var dataApi = dados.alunos;
    
    var filtraNome = dataApi.filter( aluno => aluno.nome == name);
    console.log(filtraNome);
    if (filtraNome) res.send(filtraNome); 
    else res.send('não achou nada'); */

});

const existem = ["Fabricio", "Isaias"];
const naoexistem = ["anonimo"];

var objeto = new middlewr(existem)
var objeto2 = new middlewr(naoexistem)




