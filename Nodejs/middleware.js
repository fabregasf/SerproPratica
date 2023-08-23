// middleware adaptativo

// aqui vai validar os usuarios
module.exports = function (options) {
    return function (err, req, res, next) {
      // Implement the middleware function based on the options object
      if (options == req.params.name) {
        recurso = express.static(path.join(__dirname, 'public/'+options.name));   
        next(); // espera pela proxima requisicao
      }
      else{
        console.log(err);
      }
      
  
    }
  }
  
  
  //app.use(mw({ idade: 18, cidade: 'uberaba' }))