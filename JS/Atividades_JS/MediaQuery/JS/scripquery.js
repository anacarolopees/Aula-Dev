let i = 0;
function aumenta(){
    i++;
    document.getElementById("contagem").textContent = i;
}
function diminui(){
    if(i>0){
    i--;
    document.getElementById("contagem").textContent = i;
    }else{
        exit();
    } 
}
