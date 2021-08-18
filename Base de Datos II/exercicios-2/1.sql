use psdb;
select 
 employees.first_name,
 employees.last_name,
 salaries.salary,
 salaries.from_date,
 salaries.to_date
 from employees INNER JOIN salaries
 on employees.emp_no = salaries.emp_no where employees.emp_no = 10006 ORDER BY salaries.from_date ASC ;  