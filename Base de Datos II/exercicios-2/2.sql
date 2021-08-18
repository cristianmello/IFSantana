select * from departments;
select * from dept_emp;
select * from employees;


select 
 employees.first_name as 'EmpleadoName',
 employees.last_name as 'EmpleadoLastName',
 departments.dept_name as 'deptName'
FROM employees INNER JOIN  dept_emp
ON employees.emp_no = dept_emp.emp_no

INNER JOIN departments 
ON departments.dept_no = dept_emp.dept_no;


 
 
 
 
