function prom(){
    let nome = document.getElementById("i1");
    let preco = document.getElementById("i2");
    preco = Math.trunc(preco.value);
    document.getElementById("d1").innerHTML = "<br><b> Promoção de: " + nome.value + "<br><b> pelo preço de: " + preco*2+ ",00</b>";
}
//3 variaveis e exibição de duas