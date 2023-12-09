
-- Create database using the command 
create schema Task_MySQL_1;

-- Choose the database to work with
use Task_MySQL_1;

-- Create the Table Empl
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


-- Command to Add multiple records into the table
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


-- Shows the data stored in Empl table.
select * from Empl;

-- Qn.1 Query to display ename & salary of employees greater or equal to 2200.
select ename, sal from Empl where sal>=2200;

-- Qn.2 Query to display details of employees not getting commission.
select * from Empl where comm IS NULL or comm= 0;

-- Qn.3 Query to display ename & salary of employees who don' t have salary within range 2500 to 4000.
select ename, sal from Empl where sal not between 2500 and 4000;

-- Qn.4 Query to display name, job title & salary of employees who don' t have a manager.
select ename, job, sal from Empl where mgr is null;

-- Qn.5 Query to display name of employees whose name contains "A" as third alphabet.
select ename from Empl where ename like '__A%' limit 1;

-- Qn.6 Query to display name of employees whose name contains "T" as the last alphabet
select ename from Empl where ename like '%T'limit 1;

