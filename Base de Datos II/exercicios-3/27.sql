 select  
 actor.actor_id as 'actorId',
 actor.first_name,
 actor.last_name,
 Count(film_actor.actor_id)
 FROM actor INNER JOIN film_actor
 ON actor.actor_id = film_actor.actor_id
 group by actorId order by Count(actor.actor_id) DESC;