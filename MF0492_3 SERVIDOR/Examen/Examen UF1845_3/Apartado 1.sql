/* Creo una tabla que se llama pelicula favoritas, con su id, titulos descripcion año tipo de lenguaje segun como está definido en sakila

y la duracion. Tenemos como clave primara if_film_favorite que se va autoinclementado sola  */ 

CREATE TABLE `favorite_film` (
  `id_film_favorite` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `description` text,
  `release_year` year(4) DEFAULT NULL,
  `language_id` tinyint(3) unsigned NOT NULL,
  `rental_duration` tinyint(3) unsigned NOT NULL DEFAULT '3',
  PRIMARY KEY (`id_film_favorite`),
  KEY `idx_title` (`title`),
  KEY `idx_fk_language_id` (`language_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8


/* Insertamos una pelicula en la tabla de favoritos, con los valores de cada columna exceptuando el id, que se ncrementa solo. */ 


INSERT INTO   favorite_film 
(title, description, release_year, language_id, rental_duration)
VALUES
('Piratas del Caribe', 'Pelicula de piratas de ciencia ficción', 2013, 1, 3);


