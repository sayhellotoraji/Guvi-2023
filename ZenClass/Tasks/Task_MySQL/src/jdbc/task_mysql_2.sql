show databases;

create schema Task_MySQL_2;

use Task_MySQL_2;

create table Employee(
empcode int primary key,
empname varchar(30),
empage int(3),
empsalary int
);

select * from Employee;




