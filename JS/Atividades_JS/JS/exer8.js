 var palavra = prompt("Digite uma palavra:");

 function inverterpalavra(palavra) {
   return palavra.split('').reverse().join('');
 }
 alert("Palavra: " + palavra + "\n" + "Palavra invertida: " + inverterpalavra(palavra));
