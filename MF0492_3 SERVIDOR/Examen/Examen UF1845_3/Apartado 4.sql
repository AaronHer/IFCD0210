
/* Creamos una tabla nueva para poder hacer que se dispara en ella una acccion cuando ocurra algo, 
en nuestro caso será cuando añadamos un valor en la tabla... */ 


/* El tigger que vamos a hacer va a arealizar un registro de entrad cuando se añada una pelicula nueva, 
de tal forma que ponga el nombre de la pelicula y el registro con la fecha de cuando fué puesta. */

/* por lo que creamos una tabla registro que irá variando segun añadamos peliculas */  

CREATE TABLE produc_registrado (id_film_favorite int (4), title varchar(255), insertado datetime)



CREATE TRIGGER film_AntesInsertar 
AFTER INSERT ON favorite_film FOR EACH ROW 
INSERT INTO produc_registrado ( id_film_favorite, title, insertado) 
VALUES (NEW.id_film_favorite, NEW.title, NOW()) 


/* Al insertar la nueva pelicula, se activa el disparador y se añade el registro en la tabla nueva. */