/*function myFunction(){
    alert('ola');
}

var myVar = setInterval(myTimer, 1000);
function myTimer (){
    var d = new Date;
    document.getElementById("demo").innerHTML = d.toLocaleTimeString();
    document.getElementById("demo").innerHTML = d.toLocaleTimeString();
}
function mostrarHora (){
    var d = new Date();
    document.body.innerHTML = d.getHours() + d.getMinutes() + d.getSeconds + d.toLocaleDateString();
} 

mostrarHora();

function Hora(){
    const tempo = new Date();
    const hora = tempo.getHours();
    const min = tempo.getMinutes();
    const seg = tempo.getSeconds();
    console.log(`${hora} : ${min} : ${seg}`);
    document.body.innerHTML = (`${hora} : ${min} : ${seg}`);
    setInterval(Hora,1000);
}
*/
function Anuncio(event){
    document.getElementById("demo").innerHTML = "Anuncio!!!!";
    document.getElementById("demo").style.color = "blue";
    document.body.style.backgroundImage = "url(IMG/prainha.jpg)";
}
function limpar(){
    document.getElementById("demo")="";
}
