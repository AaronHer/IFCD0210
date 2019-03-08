(function(){
	var actualizarHora = function(){
		var fecha = new Date(),
			horas = fecha.getHours(),
			ampm,
			minutos = fecha.getMinutes(),
			segundos = fecha.getSeconds(),
			diaSemana = fecha.getDay(),
			dia = fecha.getDate(),
			mes = fecha.getMonth(),
			year = fecha.getFullYear();

		var pHoras = document.getElementById ('horas'); /*accedemos con JS al párrafo */
			pAMPM = document.getElementById ('ampm');
			pMinutos = document.getElementById ('minutos');
			pSegundos = document.getElementById ('segundos');
			pDiaSemana = document.getElementById ('diaSemana');
			pDia = document.getElementById ('dia');
			pMes = document.getElementById ('mes');
			pYear = document.getElementById ('year');

		var semana = ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'];
		pDiaSemana.textContent = semana [diaSemana];
		pDia.textContent = dia;

		var meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
		pMes.textContent = meses [mes];
		pYear.textContent = year;

		/* Tenemos que hacer un condicional, en este caso de if else, para que el reloj sea de 12 h y no de 24 */

		if(horas>=12){
			horas = horas - 12;
			ampm = 'PM';
		}else{
			ampm = 'Am';
		}

		if (horas == 0){
			horas = 12;
		}

		pHoras.textContent = horas;
		pAMPM.textContent = ampm;

		if (minutos < 10) {
			minutos = "0" + minutos;
		}

		pMinutos.textContent = minutos;

		if (segundos < 10) {
			segundos = "0" + segundos;
		}

		pSegundos.textContent = segundos;

	};

	actualizarHora();
	// vamos a actualizar la variable ctualizar hora para que esté actualizando solo
	var intervalo = setInterval (actualizarHora, 1000);

}())