function gerarCitacao() {
    var nomecompleto = document.getElementById("i1").value;

    var partenome = nomecompleto.split(' ');
    // divide o nome completo em partes usando espaço
    // espaço: condição de separação

    var ultimonome = partenome.pop(); 
    // remove e pega o último valor da lista criada

    var iniciais = partenome.map(nome => nome[0]).join('. ');
    // organiza as iniciais de cada parte do nome junta elas c . e espaço
    //pegar a primeira letra das palavras e organizar elas
    //=> arrow function: sintaxe mais curta quando comparada a uma expressão de função

    //cria a citação no formato ultimo nome dps iniciais
    //$ pega o valor de uma variavel
    //deixar em caixa alta
    var citacao = `${ultimonome}, ${iniciais}.`;

    //exibe a citação no parágrafo com o id citação
    document.getElementById("citação").innerHTML = "<b>Citação Bibliográfica:</> " + citacao;
  }

  
/*
  <script>
    function validarSenha() {
      var senha = document.getElementById("senha").value;
      var resultado = document.getElementById("resultado");
      var restricoes = "";

      // Verificar o comprimento da senha (entre 8 e 15 caracteres)
      if (senha.length < 8 || senha.length > 15) {
        restricoes += "<b>A senha deve ter entre 8 e 15 caracteres.</b><br>";
      }

      // Verificar se a senha contém pelo menos uma letra maiúscula
      if (!/[A-Z]/.test(senha)) {
        restricoes += "<b>A senha deve conter pelo menos uma letra maiúscula.</b><br>";
      }

      // Verificar se a senha contém pelo menos uma letra minúscula
      if (!/[a-z]/.test(senha)) {
        restricoes += "<b>A senha deve conter pelo menos uma letra minúscula.</b><br>";
      }

      // Verificar se a senha contém pelo menos um número
      if (!/[0-9]/.test(senha)) {
        restricoes += "<b>A senha deve conter pelo menos um número.</b><br>";
      }

      if (restricoes !== "") {
        resultado.innerHTML = "Restrições:<br>" + restricoes;
      } else {
        resultado.innerHTML = "Senha válida. Bem-vindo!";
      }
    }

*/

if (!/[!@#$%^&*()_+{}|:"<>?~\-=;',.\[\]\\]/.test(senha)) {
  restricoes += "<b>possuir símbolos (no minímo 1).</b><br>";
}
