"use strict";
/*
    Algumas implementações em nodejs e typescript
}*/

exports.__esModule = true;
exports.Eventos = void 0;

var Eventos =
/** @class */
function () {
  function Eventos() {}

  return Eventos;
}();

exports.Eventos = Eventos;
var comer = new Promise(function (resolve, reject) {
  var value = 2;

  if (value >= 2) {
    resolve(value);
  } else {
    reject("Não posso comer, ainda sou bebe!");
  }
}); // vou entrar no then, apenas se o valor acima for >= 2

var eventos = new Promise(function (resolveOut) {
  resolveOut(comer.then(function (data) {
    if (data == 2) {
      console.log("idade pode começar a comer papinha");
    }
  })["catch"](function (reason) {
    console.log("Deu erro: (${reason})");
  }));
});
exports.eventos = eventos;