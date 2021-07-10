create table imcs.emp
(
	empNo int primary key,
    eName varchar(50),
    job varchar(50),
    mgr int,
    hiredate datetime, 
    sal int, 
    comm int,
    deptNo int,
    foreign key (deptNo) references dept(deptNo)
)