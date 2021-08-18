select 
staff.staff_id as 'staffId',
staff.first_name, 
staff.last_name,
count(payment.amount)
FROM staff INNER JOIN payment
ON staff.staff_id = payment.staff_id WHERE 
payment.payment_date between '2005-05-25' AND '2005-08-23'
group by staffId;