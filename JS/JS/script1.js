/*var pessoas = ["Maria", "José", "Carlos", "Ana"];
var objetos = ["Colher", "Garfo"];
var frutas = ["Uva", "Maça", "Abacaxi"];
pessoas[0]; // exibir o 1º  elemento no console
document.write("<br> Posição do elemento inicial: ");
document.write("Tamanho da lista" + pessoas.length);
objetos[objetos.length] = "Faca";
var indice = frutas.indexOf("Uva"); //resultado = 0
document.write("frutas.indexOf(\"Uva\") //resultado = " + indice)

var cores = ["Azul", "Verde", "Preto", "Amarelo", "Branco", "Lilás", "Roxo", "Rosa" ] //lista
document.write("Tamanho da lista" + cores.length);
document.write("<br> List antes de incrementar: " + cores);
cores[cores.length] = "Lima";
cores[cores.length] = "Laranja";
document.write("<br> Posição do elemento inicial: ");
document.write(cores.indexOf("Tigre"));

    var d = new Date ("October 13, 2014 11:13:00");
    document.getElementById("D1").innerHTML = d;
    //inner html inserção dos dados q eu qro colocar
    d = new Date(0);
    document.getElementById("D2").innerHTML = d;

    var d = new Date(99,5,24,11,33,30,0);
    document.getElementById("D3").innerHTML = d;
    //MêS VAI DE 0 A 11

    var d = new Date (2014,7,20); //20 de agosto de 2014
    document.getElementById("D4").innerHTML = d;

    

    d = new Date();
    document.write("<br>" + d.toUTCString());
    document.write("<br>" + d.toDateString());
    document.write("<br>" + d.toLocaleDateString());
    document.write("<br>" + d.toLocaleTimeString('pt-PT', {hour12: false}));

var hoje, prazo;
hoje = new Date();
prazo = new Date();

prazo.setFullYear(2023,10,28);
var dia = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"];
document.write("<p> Hoje é: " + dia[hoje.getDay()] 
+ "," + hoje.getDate() + "/" + (hoje.getMonth()) + "/" + hoje.getFullYear()+ "</p>");
document.write("<p> O prazo é: " + dia[prazo.getDay()] + "," + prazo.getDate() + "/" 
+ (prazo.getMonth() + 1) + "/" + prazo.getFullYear()+ "</p>");

try {
    var x = 10;
    
    if(x == "") throw "vazio";
    if(isNaN(x)) throw "nao é um número";
    if(x == 10) throw x;
    console.log(x);
    document.write(x);
}catch (err){
    console.log("Input is " + err);
    document.write("Input is " + err);
}

try{
    addlert("ERRO!!");//addlert não existe
}
catch(err){
    document.write = err.message;
}


var dividendo = 10;
var divisor = 0;

try{
    if(divisor == 0){
        throw new 
        Error("Erro: Divisão por zero não pode");
    }
    var resultado = dividendo/divisor;
    console.log("Resultado: ", resultado);    
}catch (err){
    console.log(err.message);
}

function myFunction(){
    var message, x;
    message = document.getElementById("message");
    message.innerHTML = "";
    x = document.getElementById("demo").value;
    try{
        if(x == "") throw "empty";
        if(isNaN(x)) throw "not a number";
        x = Number (x);
        if(x<5) throw "too low";
        if(x > 10) throw "too high";
    }
    catch(err){
        message.innerHTML = "Input is " + err;
    }
}
*/
try{
    addlert("ERRO!!");
}catch (err){
    document.write("<br>" + err.message);
}finally{
    document.write("<br> Sera mostrado mesmo c o erro");
}
