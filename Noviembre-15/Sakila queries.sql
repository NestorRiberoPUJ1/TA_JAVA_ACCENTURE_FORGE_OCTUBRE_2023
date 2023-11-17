
#1 customers inside city_id = 312
SELECT customer.first_name,customer.last_name,customer.email,address.address FROM customer
JOIN address ON customer.address_id=address.address_id
WHERE address.city_id=312
;

#2 Comedy Films
SELECT film.title,film.description, film.release_year,film.rating,film.special_features, category.name as genre FROM film
JOIN film_category ON film_category.film_id= film.film_id
JOIN category ON category.category_id=film_category.category_id
WHERE category.name="Comedy"
;

#3 get all the films joined by actor_id=5
SELECT CONCAT(actor.first_name," ",actor.last_name) as actor_name, film.title, film.description, film.release_year FROM film
JOIN film_actor ON film.film_id=film_actor.film_id
JOIN actor ON film_actor.actor_id=actor.actor_id
WHERE actor.actor_id=5
;

#4 get all the customers in store_id = 1 and inside these cities (1, 42, 312 and 459)
SELECT store.store_id,address.city_id,customer.first_name,customer.last_name,customer.email,address.address FROM customer
JOIN store ON customer.store_id=store.store_id
JOIN address ON customer.address_id=address.address_id
WHERE store.store_id=1
AND address.city_id IN (1,42,312,459)
;

#5  films with a rating = G and special feature = behind the scenes, joined by actor_id = 15
SELECT film.title,film.description,film.release_year,film.rating,film.special_features FROM film
JOIN film_actor ON film.film_id=film_actor.film_id
JOIN actor ON film_actor.actor_id=actor.actor_id
WHERE film.rating="G"
AND film.special_features like "%Behind the Scenes%"
AND actor.actor_id=15
; 

#6 get all the actors that joined in the film_id = 369

SELECT film.film_id,film.title,actor.actor_id, CONCAT(actor.first_name," ",actor.last_name) as actor_name FROM actor
JOIN film_actor ON actor.actor_id=film_actor.actor_id
JOIN film ON film_actor.film_id=film.film_id
WHERE film.film_id=369
;

#7  get all drama films with a rental rate of 2.99

SELECT film.film_id,film.title,film.description,film.release_year,film.rating,film.special_features,category.name as genre,film.rental_rate FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id=category.category_id

WHERE film.rental_rate=2.99
AND category.name="Drama"
;

#8 action films joined by SANDRA KILMER
SELECT actor.actor_id, CONCAT(actor.first_name," ",actor.last_name) as actor_name,
film.film_id,film.description, film.release_year,film.rating,film.special_features,category.name as genre
FROM film
JOIN film_category ON film.film_id=film_category.film_id
JOIN category ON film_category.category_id=category.category_id

JOIN film_actor ON film.film_id= film_actor.film_id
JOIN actor ON film_actor.actor_id= actor.actor_id

WHERE category.name="Action"
AND actor.first_name="SANDRA"
AND actor.last_name ="KILMER"
;
