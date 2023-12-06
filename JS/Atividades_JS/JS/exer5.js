function verificar(){
    var numero = document.getElementById("i1").value;
    if (numero % 2 === 0) {
        document.getElementById("demo").innerHTML = numero + " é um número par.";
    } else {
        document.getElementById("demo").innerHTML = numero + " é um número ímpar.";
    }

}
