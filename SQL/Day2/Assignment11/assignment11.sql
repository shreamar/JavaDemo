use imcs;

# a. List the number of employees and average salary for employees in department 20  
select count( empNo), avg(sal)
from   emp
where deptNo = 20;


# b. List name, salary and PF amount amount of all   employees. PF is calculated as 10% of basic salary   
select eName as "Employee Name", sal as "Salary", sal*0.1 as "PF" from   emp; 

# c. List names of   employees who are more than 25 years old in the company.   
select eName,  timestampdiff(year, hiredate, curdate()) as "Years in company" from emp
where
timestampdiff(year, hiredate, curdate())>25 ;

# d. List the   employees details in the ascending order of their basic salary.   
select * 
from   emp
order by sal;

# e. List the   employee name and hire date in the descendig order of their hire date.   
select eName as "Name", hiredate
from   emp
order by hiredate  desc;

# f. List   employee name, salary, PF, HRA, DA and gross order the results in the ascending order of gross.   
select eName, sal, sal*0.1 as "PF", sal*0.5 as "HRA", sal*0.3 as "DA", 
		((sal*0.1)+(sal*0.5)+(sal*0.3)) as "Gross"
from   emp
order by Gross;

# g. List the department numbers and number of employees in each department.   
select deptNo, count( empNo) as "Num of employee"
from   emp
group by deptNo;

# h. List the department number and total salary in each department.   
select deptNo, sum(sal) as "Total salary"
from   emp
group by
deptNo;

# i. List the jobs and number of employees in each job. The result should be in the descending order of the number of employees.   
select job as "Designation", count(empNo) as "Num of employees"
from   emp
group by job
order by 'Num of employees' desc;

# j. List the total salry, maximum and minium salary of the employees jobwise.   
select job as "Position", sum(sal) as "Total salary", max(sal) as "Maximum Salary", min(sal) as "Minimum salary"
from emp
group by job;        

# k. List the total salary, maximum and minimum salary and average salary of the   employees, for dept 20.   
select job as "Position",deptNo, sum(sal) as "Total salary", max(sal) as "Maximum Salary", 
min(sal) as "Minimum salary", avg(sal) as "Average salary" 
from   emp
where deptNo = 20
group by job;


# l. List the average salary of the employees job wise, for department 20 and display only those rows having an average salary > 1000   
select job as "Position",deptNo, avg(sal) as "Average salary" 
from   emp
where deptNo = 20
group by job
having avg(sal) > 1000;

