"use strict";
/*
    Algumas implementações em nodejs e typescript
}*/
Object.defineProperty(exports, "__esModule", { value: true });
exports.Eventos = void 0;
var Eventos = /** @class */ (function () {
    function Eventos() {
        // eventos sendo inicializados
        this.initEvents = function () { return function () {
            eventos;
        }; };
        this.initEvents();
    }
    return Eventos;
}());
exports.Eventos = Eventos;
var comer = function () { return function () {
    console.log("estou iniciando a comilança!");
}; };
var eventos = new Promise(function (resolve) {
    resolve(comer);
});
var eventostwo = new Promise(function (comer) {
}).catch(function (reason) {
    console.log("Manuseie a promise rejeitada (".concat(reason, ") aqui."));
});
