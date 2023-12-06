function consultar(){
    var cep = document.getElementById("i1");
    var novap = document.createElement("p");
    novap.innerHTML="<b> CEP: </b>" + cep.value + "<br><b>Logradouro:</b> Avenida Ângelo Ramos<br><b>Bairro:</b> Centro <br><b> Cidade: </b> Porto Ferreira <br><b> Estado: </b>SP";
    var element = document.getElementById("i2");
    element.appendChild(novap);
}
