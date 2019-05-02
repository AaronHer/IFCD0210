

/* crear una vista par ver la pelicuas de ED */

CREATE VIEW vista_prueba
AS
SELECT film_actor.actor_id
FROM film_actor
INNER JOIN actor ON actor.actor_id = film_actor.actor_id
WHERE fisrt_name = 'ED'