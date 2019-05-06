

/* Vamos a poner el impuesto IGIC  las Peliculas */

/* Hacemos una consulta para ver como queda la tabla, 
se ve que los valores son con varios decimales, y la funsion va a quitar dichos decimales */ 

SELECT title, description, rental_rate, rental_rate*1.07 AS Precio_con_IGIC FROM film


/* usaremos la funcion round */  

CREATE DEFINER=`root`@`localhost` PROCEDURE `simple`() NOT DETERMINISTIC CONTAINS SQL SQL SECURITY DEFINER BEGIN SELECT title, description, rental_rate, round (rental_rate*1.07,2) AS Precio_con_IGIC FROM film; END 