function addValor(valor) {
    document.getElementById("display").value += valor;
}
function Limpar() {
    document.getElementById("display").value = '';
}
function Calcular() {
    var valor = document.getElementById("display").value;
    document.getElementById("display").value = eval(valor);
}