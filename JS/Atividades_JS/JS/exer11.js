function gerarTabuada() {
    var numero = parseInt(document.getElementById("numero").value);

    if (isNaN(numero)) {
        alert("Por favor, insira um número válido.");
        return;
    }

    var tabuada = "<h2>Tabuada " + numero + ":</h2><ul>";
    for (var i = 1; i <= 10; i++) {
        tabuada += "<li>" + numero + " x " + i + " = " + (numero * i) + "</li>";
    }
    tabuada += "</ul>";

    document.getElementById("tabuada").innerHTML = tabuada;
}
