use imcs;

# a) List the names of analyst and salesmen
select eName from emp 
where 
(emp.job = 'Analyst' or  emp.job = 'Salesman');

# b) List details of employees who have joined before 30 Sept 81
select * from emp 
where 
emp.hiredate < '1981-09-30';

# c) List names of employees who are not managers
select eName from emp 
where 
job != "Manager";

# d) List the names of employees whose employee numbers are 7369, 7521, 7839, 7934, 7788
select eName, empNo  from emp 
where 
(empNo = 7369 or empNo = 7521 or empNo = 7839 or empNo = 7934 or empNo = 7788);

# e) List employee not belonging to department 30,40, or 10
select eName, deptNo from emp
where
(deptNo != 30 and deptNo != 40 and deptNo !=10);

# f) List employees names for those who have joined between 30 June and 31 Dec. 81
select eName, hiredate from emp
where
(hiredate > '1981-06-30' and hiredate < '1981-12-21');

# g) List the different designations in the company
select distinct job from emp; 

# h) List the names of employees who are not eligible for commission
select eName, job from emp
where
comm is null;

# i) List the name and designation of employee who does not report to anybody
select eName , job from emp
where
mgr is null;

# j) List the employees not assigned to any department
select eName from emp
where
deptNo is null;

# k) List the employees who are eligible for commission
select eName, job from emp
where
comm is not null;

# l) List employees whose names either start or end with "S"
 select eName from emp
 where
 (eName like 'S%' or eName like '%s');
 
 # m) List names of employees whose names have 'i' as the second character
 select eName from emp
 where
 eName like '_i%';
 
 # n) List the nummber of employees working with the company
 select count(empNo) as "Total number of employees" from emp; 
 
 /# o) List the number of designations available in the emp table
 select  count(distinct job) "Total number of designations" from emp;
 
 # p) List the total salaries paid to the employees
 select sum(sal) as "Total salaries paid" from emp;
 
 # q) List the maximum, minimum and average salary in the company
 select max(sal) as "Max salary", min(sal) as "Min Salary", avg(sal) as "Avg Salary" from emp;    

# r) List the maximum salary paid to a salesman
select max(sal) as "Max salary paid to salesman" from emp where job = 'Salesman';