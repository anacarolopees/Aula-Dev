
function limpa_form(){
    document.getElementById('rua').value=("");
    document.getElementById('bairro').value=("");
    document.getElementById('cidade').value=("");
    document.getElementById('estado').value=("");

}
function atualiza_campos(conteudo){
    if(!("erro" in conteudo)){
        document.getElementById('rua').value=(conteudo.rua);
        document.getElementById('bairro').value=(conteudo.bairro);
        document.getElementById('cidade').value=(conteudo.cidade);
        document.getElementById('estado').value=(conteudo.estado);

    }else{
        limpa_form();
        alert("CEP NÃO ENCONTRADO!");
    }

}
function pesquisacep(valor){
    //var cep recebe apenas valores decimais (inteiros)
    var cep = valor.replace(/\D/g,'');
    //condição de validação
    if(cep != ""){
        var validacep = /^[0-9]{8}$/;
        if(validacep.test(cep)){
            document.getElementById('rua').value="carregando";
            document.getElementById('bairro').value="carregando";
            document.getElementById('cidade').value="carregando";
            document.getElementById('estado').value="carregando";
            var elemento = document.createElement('script');
            //adicionou informação no elemento
            elemento.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=atualiza_campos';
            //insere script no documento e carrega seu conteudo 
            document.body.appendChild(elemento);
}else{
    limpa_form();
    alert("Formato de CEP inválido");
}
}
else{
    limpa_form();
}

};
    