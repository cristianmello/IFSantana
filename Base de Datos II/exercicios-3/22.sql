SELECT         
customer.customer_id as 'customerId',
customer.first_name as 'firstName',	
customer.last_name as 'lastName',
SUM(payment.amount)
FROM payment INNER JOIN customer 
ON payment.customer_id = customer.customer_id
group by customerId order by firstName, lastName;