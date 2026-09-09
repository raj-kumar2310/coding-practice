# Write your MySQL query statement below
select name from SalesPerson s
where not exists (
    select * from Orders o
    join Company c on o.com_id =c.com_id 
    where c.name='RED' and s.sales_id =o.sales_id
)