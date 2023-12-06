function tracos(){
    let name=document.getElementById("valor").value;
    let palavras = name.split(" ");
    let traco = "";
    for(let i=0; i < palavras.length;i++){
        let letras = palavras[i].split('');
        let letrast= letras.length;
        traco = traco + " " + "-".repeat(letrast);
    }
    console.log(traco);
    document.getElementById("nome").textContent= name;
    document.getElementById("linhas").textContent= traco;
    categorizar();
}

function categorizar(){
    let idade=document.getElementById("valor2").value;
    if(idade <= 12){
        document.getElementById("categoria").textContent ="Categoria: Infantil";    
    }else if(idade <= 18){
        document.getElementById("categoria").textContent ="Categoria: Juvenil";    
    }else if(idade > 18){
        document.getElementById("categoria").textContent ="Categoria: Adulto";    
    }
}