
/* Vamos a realizar una seleccion entre actores y peliculas de la bbdd sakila */ 


/* Lista donde se busquen las peliculas y los actores en la misma lista */

SELECT actor.first_name , film.title 
FROM actor, film 
WHERE actor.actor_id = film.film_id
ORDER BY actor;

/* Busqueda para saber el idioma de cada lista favorita ya que, cuando buscamos en 
las listas, solo aparecen los valores que corresponden y tenemos que comprobarlo en otra lista
con esto conseguimos juntar ambos conceptos
La ordenamos segun el orden alfabetico de las películas */ 

SELECT favorite_film.title , language.name 
FROM favorite_film, language 
WHERE favorite_film.language_id = language.language_id
ORDER BY title;


SELECT actor.first_name , film_actor.actor_id 
FROM actor, film_actor 
WHERE actor.actor_id = film_actor.actor_id 
ORDER BY first_name 


/* LEFT JOIN */ 
SELECT title, description, favorite_film.language_id
FROM favorite_film 
LEFT JOIN language 
ON favorite_film.language_id = language.language_id
WHERE language.language_id IS NULL


/* INNER JOIN */
SELECT *
FROM actor
INNER JOIN film
WHERE actor.actor_id = film.film_id


