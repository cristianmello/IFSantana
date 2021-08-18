select  
 actor.actor_id,
 actor.first_name,
 actor.last_name,
 Count(film_actor.actor_id)
 FROM actor INNER JOIN film_actor
 ON actor.actor_id = film_actor.actor_id
 where actor.actor_id = 100;