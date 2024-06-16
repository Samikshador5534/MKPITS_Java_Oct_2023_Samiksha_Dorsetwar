SELECT * FROM sakila.film;

#Display the rental date and return date for each rental along with the customer first name and last name.


select  rental_date , return_date , first_name ,last_name
 from rental  join customer  on rental.customer_id = customer.customer_id;  
 
 
