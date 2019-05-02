CREATE TRIGGER ACTOR_AI
AFTER INSERT ON ACTOR
FOR EACH ROW
AS print 'hubo un cambio en la tabla actor'