    function submitFunction(cmp1,cmp2) {
    if(cmp1.value == null || cmp1.value == ""){
        alert("Favor prencher o campo1");
    }else if(cmp2.value == null|| cmp2.value == ""){
        alert("Favor prencher o campo 2");
    }else {
        alert("Obrigada!")
    }

}
window.onbeforeunload = function(){
    return 'Tchau';
}
