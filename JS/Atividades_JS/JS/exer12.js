function calcularParcelas() {
    var precoProduto = parseFloat(document.getElementById("precoProduto").value);
    var resultado = document.getElementById("resultado");

    if (isNaN(precoProduto) || precoProduto <= 0) {
        resultado.innerHTML = "nsira um preço válido.";
    } else {
        var opcoesPagamento = "Opções de pagamento:<br><br>";

        for (var parcelas = 1; parcelas <= 10; parcelas++) {
            var valorParcela = (precoProduto / parcelas).toFixed(2);
            opcoesPagamento += parcelas + "x de R$" + valorParcela + "<br>";
        }

        resultado.innerHTML = opcoesPagamento;
    }
}