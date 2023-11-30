

# CLIENTES QUE HAN ALQUILADO PELICULAS DE ACCIÓN

SELECT customer.* FROM customer
#Traemos lo tabla rental basandonos en la llave foranea customer_id
JOIN rental ON customer.customer_id = rental.customer_id
#Traemos la tabla inventory basandonoes en la llave foranea inventory_id
JOIN inventory ON rental.inventory_id=inventory.inventory_id
#Traemos la tabla film inventory basandonoes en la llave foranea film_id
JOIN film ON inventory.film_id = film.film_id
#Traemos la tabla film_category inventory basandonoes en la llave foranea film_id
JOIN film_category ON film.film_id = film_category.film_id
#Traemos la tabla category basandonoes en la llave foranea category_id
JOIN category ON  film_category.category_id=category.category_id

#BUSCAMOS SOLO LAS QUE EL NOMBRE DE LA CATEGORIA SEA Action
WHERE category.name = "Action"

#AGRUPAR POR CLIENTE
GROUP BY customer.customer_id


ORDER BY customer.customer_id
;