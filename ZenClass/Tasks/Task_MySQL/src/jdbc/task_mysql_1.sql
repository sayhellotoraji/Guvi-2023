
create schema Task_MySQL_1;

use Task_MySQL_1;

create table Empl(
empno int, 
ename varchar(30),
job enum('CLERK', 'SALESMAN', 'ANALYST', 'MANAGER', 'PRESIDENT'),
mgr int,
hiredate date, 
sal float(10,2),
comm float(10,2),
deptno int,
primary key (empno), 
foreign key(mgr) REFERENCES Empl(empno)
);


insert into 
Empl(empno, ename, job, mgr, hiredate, sal, comm, deptno) 
values
(1111, 'AMIR', 'PRESIDENT', null, '1991-11-18', 5000.00, null, 10),
(2222, 'MAHADEVAN', 'MANAGER', 1111, '1991-04-02', 2985.00, null, 20),
(3333, 'BINA', 'MANAGER', 1111, '1991-05-01', 2850.00, null, 30),
(4444, 'SHIVANSH', 'MANAGER', 1111, '1991-06-09', 2450.00, null, 10),
(5555, 'SCOTT', 'ANALYST', 3333, '1992-12-09', 3000.00, null, 20),
(6666, 'ANA', 'SALESMAN', 3333, '1991-02-20', 1600.00, 300.00, 30),
(7777, 'SETH', 'SALESMAN', 3333, '1991-02-22', 1250.00, 500.00, 30),
(8888, 'MOMIN', 'SALESMAN', 3333, '1991-09-28', 1250.00, 1400.00, 30),
(9999, 'KULDEEP', 'SALESMAN', 4444, '1991-09-08', 1500.00, 0.00, 30),
(10000, 'SMITH', 'CLERK', 2222, '1990-12-18', 800.00, null, 20);


select * from Empl;

select ename, sal from Empl where sal>=2200;

select ename from Empl where comm IS NULL or comm= 0;

select ename, sal from Empl where sal not between 2500 and 4000;

select ename, job, sal from Empl where mgr is null;

select ename from Empl where ename like '__A%';

select ename from Empl where ename like '%T';

