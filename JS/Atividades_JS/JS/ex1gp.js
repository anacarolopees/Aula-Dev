//pega o valor inserido no campo de entrada dgebi
function crescente() {
    let num = document.getElementById("i1").value;
    //array vazio seq
    let seq = [];
    seq.push(num);
  //incrementa o valor de num e o adiciona ao array até que haja 10 elementos no array
    for (let i = 0; i < 10; i++) {
      num++;
      seq.push(num);
    }
  
    // Converter o array 'seq' em uma string JSON
    let jsonSeq = JSON.stringify(seq);
  
    // Exibir a string JSON no elemento com id "p1"
    document.getElementById("p1").innerHTML += jsonSeq;
  }
  
  //dowhile acrescenta n ao conteúdo do elemento com id="p2" e continua até que n seja igual a 0
  function decrescente() {
    let n = document.getElementById("i1").value;
    document.getElementById("p2").innerHTML += n;
  
    do {
     //subtraindo 1 de n, decrementando
      n--;
      document.getElementById("p2").innerHTML += "," + n;
    } while (n != 0);
  }