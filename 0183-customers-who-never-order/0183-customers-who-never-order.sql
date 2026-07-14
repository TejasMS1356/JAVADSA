# Write your MySQL query statement below
select name as Customers from Customers where Customers.id NOT IN(select customerId from Orders); 
