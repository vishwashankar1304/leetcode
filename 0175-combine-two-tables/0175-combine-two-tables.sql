# Write your MySQL query statement below
select person.firstName AS firstName,person.lastName AS lastName,address.city,address.state 
from person LEFT join address on person.personid=address.personid;