SELECT           
customer.customer_id as 'customerId',
customer.first_name,	
customer.last_name,
SUM(payment.amount) as 'sumPayment'
FROM payment INNER JOIN customer 
ON payment.customer_id = customer.customer_id
group by customerId
Having sumPayment > 100
order by payment.amount;