function adicionarcontato() {
    var nome = prompt('Nome');
    var email = prompt('Email');
    var novalista = document.createElement("li");
    novalista.innerHTML = "Nome: " + nome + " Email: " + email;
    var element = document.getElementById("listctt");
    element.appendChild(novalista);
}
