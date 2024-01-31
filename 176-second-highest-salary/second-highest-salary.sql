# Write your MySQL query statement below
select max(salary) as SecondHighestSalary from Employee where salary< (SELECT MAX(salary) as SecondHighestSalary FROM Employee ORDER BY salary );
 