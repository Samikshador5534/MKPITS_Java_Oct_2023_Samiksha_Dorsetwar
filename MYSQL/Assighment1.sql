#Retrieve all films with a rental duration of more than 5 days:

use sakila;
SELECT *
FROM film
WHERE rental_duration > 5;

#List all customers who live in the city of 'San Diego':
use sakila;
SELECT *
FROM customer
WHERE address_id IN (
    SELECT address_id
    FROM address
    WHERE city_id = (
        SELECT city_id
        FROM city
        WHERE city = 'San Diego'
    )
);

#Find all films with a rating of 'PG-13' and sort them by title:

SELECT *
FROM film
WHERE rating = 'PG-13'
ORDER BY title;

#Display all actors whose last name starts with 'A' and order by first name:

SELECT *
FROM actor
WHERE last_name LIKE 'A%'
ORDER BY first_name;

#Retrieve all films released in the year 2006:

SELECT *
FROM film
WHERE release_year = 2006;

#Find all customers whose first name is 'John' and sort by last name in descending order:

SELECT *
FROM customer
WHERE first_name = 'John'
ORDER BY last_name DESC;

#List all films with a rental rate between 2.99 and 4.99, inclusive:

SELECT *
FROM film
WHERE rental_rate BETWEEN 2.99 AND 4.99;

#Retrieve all actors with a last name containing 'son' and order by last name:

SELECT *
FROM actor
WHERE last_name LIKE '%son%'
ORDER BY last_name;

#Find all stores in city 'Los Angeles' and sort by store ID:

SELECT *
FROM store
WHERE address_id IN (
    SELECT address_id
    FROM address
    WHERE city_id = (
        SELECT city_id
        FROM city
        WHERE city = 'Los Angeles'
    )
)
ORDER BY store_id;

#Display all films with a replacement cost greater than 20 and sort by replacement cost in ascending order

SELECT *
FROM film
WHERE replacement_cost > 20
ORDER BY replacement_cost ASC;

#List all films with a length greater than 120 minutes:

SELECT *
FROM film
WHERE length > 120;

#Find all customers who have an active status (status = 1):

SELECT *
FROM customer
WHERE active = 1;

#Retrieve all films with a rental rate of 0.99 and sort them by length in descending order:

SELECT *
FROM film
WHERE rental_rate = 0.99
ORDER BY length DESC;

#Display all actors with a first name containing 'Tom' and order by last name:

SELECT *
FROM actor
WHERE first_name LIKE '%Tom%'
ORDER BY last_name;

#Find all films with a replacement cost less than 15 and sort them by title:

SELECT *
FROM film
WHERE replacement_cost < 15
ORDER BY title;








