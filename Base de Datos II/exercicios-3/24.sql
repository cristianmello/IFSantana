select    
staff.staff_id as 'staffId',
staff.first_name, 
staff.last_name,
count(payment.amount)
FROM staff INNER JOIN payment
ON staff.staff_id = payment.staff_id
group by staffId;