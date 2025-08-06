select d.name as Department , e.name as Employee,e.salary Salary 
from employee e , department d where d.id=e.departmentid and 
(select count(distinct salary) from employee
where salary>e.salary and e.departmentid=departmentid )<3
order by d.id,salary;