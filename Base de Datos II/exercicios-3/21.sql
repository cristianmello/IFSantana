SELECT           
customer.customer_id as 'customerId',
customer.first_name,	
customer.last_name,
SUM(payment.amount)
FROM payment INNER JOIN customer 
ON payment.customer_id = customer.customer_id
group by customerId;