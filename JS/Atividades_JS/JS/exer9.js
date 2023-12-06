function validasenha() {
    var senha = document.getElementById("senha").value;
    var resultado = document.getElementById("resultado");
    var restricoes = "";

    if (senha.length < 8 || senha.length > 15) {
        restricoes += "<b>A senha deve possuir entre 8 e 15 caracteres, </b><br>";
    }
    if (!/[0-9]/.test(senha)) {
        restricoes += "<b>possuir números (no minímo 1), </b><br>";
    }
    if (!/[a-z]/.test(senha)) {
        restricoes += "<b>possuir letras minúsculas (no minímo 1), </b><br>";
    }

    if (!/[A-Z]/.test(senha)) {
        restricoes += "<b>possuir letras maiúsculas (no minímo 2), </b><br>";
    }
    if (!/[!@#$%¨&*]/.test(senha)) {
        restricoes += "<b>possuir caracteres especiais (no minímo 2), </b><br>";
    }
      if (restricoes !== "") {
        resultado.innerHTML = "ERRO:<br>" + restricoes;
      } else {
        resultado.innerHTML = "Senha válida. BEM VINDO AO SISTEMA!";
      }
    }






   