# Write your MySQL query statement below
select p.product_name as product_name,s.year as year,s.price as price
from sales s inner join product p on s.product_id=p.product_id;