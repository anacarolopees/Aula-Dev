function blurFunction(){
    document.getElementById("myInput").style.background ="red";
}
function myFunction(val){
    alert("mudou para " +  val);
}
function loadFunction(){
    alert("Página carregada!!");
}
function mouseDown(){
document.getElementById("myP").style.color = "red";
}
function mouseUp(){
    document.getElementById("myP").style.color = "green";
    }
    
    //mostrar as coordenadas 
function coordenadasFigura(event) {
        var x = event.clientX;
        var y = event.clientY;
        document.getElementById("demo3").innerHTML = "Coordenada X: " + x + ", Coordenada Y: " + y;
    }

    // n aparece as coordenadas quando o mouse sai, limpa elas
    function clearCoor() {
        document.getElementById("demo3").innerHTML = "";
    }

    // muda de cor quando o mouse aperta 
    function mouseDown() {
        document.getElementById("myP").style.color = "red";
    }

    function mouseUp() {
        document.getElementById("myP").style.color = "black";
    }
    