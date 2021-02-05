var verificador = (function () {

  var add = function() {
      var valores = $("#lista").val(); //coge el valor del campo //"#" jquery
      listaValores = valores.split(',');
      datos.calcular(listaValores, view);
  }

  var view = function(error, numeros) {
    if(error != null){
    alert("Datos no validos");
    return;
  }
    $("#media").text(numeros.media);
    $("#desvi").text(numeros.desvi);
  }

  return {
      calcularValores: function() {
          add();
      }
  }

})();