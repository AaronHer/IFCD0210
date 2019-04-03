/*function cambiarFondo() {
    var contenido = document.getElementById("Contenedor");
    var contenido1 = document.getElementById("titulo");
    contenido.style.background = "black" ;
    contenido.style.color = '#D7D93C';
    contenido1.style.color = '#D7D93C';

    var contenido = document.getElementById("Contenedor1");
    var contenido1 = document.getElementById("titulo1");
    contenido.style.background = "black" ;
    contenido.style.color = '#D7D93C';
    contenido1.style.color = '#D7D93C';
}*/


$(document).ready(function() {
	$("#tema-claro").click(function() {
		$("*").css('backgroundColor', '#eee');
		$("*").css('color', '#000');
	});
	$("#tema-oscuro").click(function() {
		$("*").css('backgroundColor', '#111');
		$("*").css('color', '#ff0');
	});
	$("#agrandar-letra").click(function() {
		$("body").css('fontSize', '1.8em');
		$("#top").css('margin-top', '95em');
	});
	$("#disminuir-letra").click(function() {
		$("body").css('fontSize', '1.1em');
		$("#top").css('margin-top', '125em');
	});
});